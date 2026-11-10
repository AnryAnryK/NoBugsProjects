package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.deposit.negative;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.ProfileRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.ResponseSpecs;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DepositParametrizedAccountNegativeTests extends BaseTest {

	private RequestSpecification requestSpecification;
	private DepositRequester forbiddenDepositRequester;
	private ProfileRequester profileRequester;

	String username = RandomData.getUsername();
	String password = RandomData.getPassword();


	@BeforeEach
	void setUp() {
		createNewUserByAdmin();
		createAccount();
		requestSpecification = RequestSpecs.authAsUser(username, password);
		forbiddenDepositRequester = new DepositRequester(requestSpecification, ResponseSpecs.requestReturnsBad403Request());
		profileRequester = new ProfileRequester(requestSpecification, ResponseSpecs.requestReturnsOK());
	}

	void createNewUserByAdmin() {
		Map<String, String> personalData = Map.of("username", username, "password", password, "role", Roles.USER.toString());
		given()
				.spec(RequestSpecs.unauthSpec())
				.auth().preemptive().basic("admin", "admin")
				.body(personalData)
				.post("/api/v1/admin/users")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_CREATED)
				.body("username", Matchers.equalTo(username))
				.body("password", Matchers.not(Matchers.equalTo(password)))
				.body("role", Matchers.equalTo(Roles.USER.toString()));

		given()
				.spec(RequestSpecs.authAsUser(username, password))
				.get("/api/v1/customer/profile")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id", Matchers.notNullValue())
				.body("username", Matchers.notNullValue())
				.body("password", Matchers.notNullValue())
				.body("role", Matchers.equalTo(Roles.USER.toString()));
	}

	void createAccount() {
		 given()
				 .spec(RequestSpecs.authAsUser(username, password))
				.post("/api/v1/accounts")
				.then()
				.assertThat()
				.body("id", Matchers.notNullValue())
				.body("accountNumber", Matchers.notNullValue())
				.body("balance", Matchers.notNullValue())
				.body("transactions", Matchers.notNullValue())
				.statusCode(HttpStatus.SC_CREATED);
	}

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(1515, 50.01, "Unauthorized access to account"),
				Arguments.of(4, 0.01, "Unauthorized access to account")
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectAccountNegativeTests(int id, double balance, String errMessage) {

		double balanceBefore = profileRequester.get()
				.extract().jsonPath().getDouble("accounts[0].balance");

		DepositRequest depositRequest = new DepositRequest(id, balance);

		forbiddenDepositRequester.post(depositRequest)
				.body(Matchers.containsString(errMessage));

		double balanceAfter = profileRequester.get()
				.extract().jsonPath().getDouble("accounts[0].balance");

		assertThat(balanceAfter, is(balanceBefore));
	}
}

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

public class DepositParametrizedSumNegativeTests extends BaseTest {
	private RequestSpecification requestSpecification;
	private DepositRequester badRequestDepositRequester;
	private ProfileRequester profileRequester;

	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	int accountId;

	@BeforeEach
	void setUp() {
		createNewUserByAdmin();
		accountId = createAccount();
		requestSpecification = RequestSpecs.authAsUser(username, password);
		badRequestDepositRequester = new DepositRequester(requestSpecification, ResponseSpecs.requestReturnsBadRequest());
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

	int createAccount() {
		return given()
				.spec(RequestSpecs.authAsUser(username, password))
				.post("/api/v1/accounts")
				.then()
				.assertThat()
				.body("id", Matchers.notNullValue())
				.body("accountNumber", Matchers.notNullValue())
				.body("balance", Matchers.notNullValue())
				.body("transactions", Matchers.notNullValue())
				.statusCode(HttpStatus.SC_CREATED)
				.extract().path("id");
	}

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(0, "Deposit amount must be at least 0.01"),
				Arguments.of(5000.01, "Deposit amount cannot exceed 5000"),
				Arguments.of(-50.99, "Deposit amount must be at least 0.01")
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectSumNegativeTests(double balance, String errMessage) {
		double balanceBefore = profileRequester.get()
				.extract().jsonPath().getDouble("accounts[0].balance");

		DepositRequest depositRequest = new DepositRequest(accountId, balance);

		badRequestDepositRequester.post(depositRequest)
				.body(Matchers.containsString(errMessage));

		double balanceAfter = profileRequester.get()
				.extract().jsonPath().getDouble("accounts[0].balance");

		assertThat(balanceAfter, is(balanceBefore));
	}
}

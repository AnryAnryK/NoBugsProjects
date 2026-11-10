package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.deposit.positive;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.TransferRequester;
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

public class DepositParametrizedPositiveTests extends BaseTest {
	private RequestSpecification requestSpecification;
	private ResponseSpecification responseSpecification;
	private DepositRequester depositRequester;
	private TransferRequester transferRequester;

	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	int accountId;

	@BeforeEach
	void setUp() {
		createNewUserByAdmin();
		accountId = createAccount();
		requestSpecification = RequestSpecs.authAsUser(username, password);
		responseSpecification = ResponseSpecs.requestReturnsOK();
		depositRequester = new DepositRequester(requestSpecification, responseSpecification);
		transferRequester = new TransferRequester(requestSpecification, responseSpecification);
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
				Arguments.of(5.01),
				Arguments.of(5000.00),
				Arguments.of(4999.99),
				Arguments.of(0.01)
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositPositiveTests(double balance) {

		DepositRequest depositRequest = new DepositRequest(accountId, balance);

		depositRequester.post(depositRequest)
				.body("id", Matchers.notNullValue())
				.body("accountNumber", Matchers.notNullValue())
				.body("balance", Matchers.notNullValue())
				.body("transactions", Matchers.notNullValue())
				.body("transactions.type", Matchers.hasItem("DEPOSIT"))
				.body("transactions.timestamp", Matchers.notNullValue())
				.body("transactions.relatedAccountId", Matchers.notNullValue());

		transferRequester.get(accountId)
				.body("id", Matchers.notNullValue())
				.body("amount", Matchers.notNullValue())
				.body("type", Matchers.hasItem("DEPOSIT"))
				.body("timestamp", Matchers.notNullValue())
				.body("relatedAccountId", Matchers.notNullValue());
	}
}

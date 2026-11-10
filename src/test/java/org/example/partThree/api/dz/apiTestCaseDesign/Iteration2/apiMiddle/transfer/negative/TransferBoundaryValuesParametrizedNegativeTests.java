package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.transfer.negative;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.TransferRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.ProfileRequester;
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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TransferBoundaryValuesParametrizedNegativeTests extends BaseTest {
	RequestSpecification requestSpecification;
	ResponseSpecification responseSpecification;
	DepositRequester depositRequester;
	TransferRequester transferBad;
	TransferRequester transferOk;
	ProfileRequester profileRequester;

	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();

	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	int receiverAccountId;
	int senderAccountId;

	@BeforeEach
	void setUp() {
		createNewUser1ByAdmin();
		createNewUser2ByAdmin();
		senderAccountId = createAccount1();
		receiverAccountId = createAccount2();
		requestSpecification = RequestSpecs.authAsUser(username1, password1);
		responseSpecification = ResponseSpecs.requestReturnsOK();
		depositRequester = new DepositRequester(requestSpecification, responseSpecification);
		transferOk = new TransferRequester(requestSpecification, ResponseSpecs.requestReturnsOK());
		transferBad = new TransferRequester(requestSpecification, ResponseSpecs.requestReturnsBadRequest());
		profileRequester = new ProfileRequester(requestSpecification, ResponseSpecs.requestReturnsOK());
	}

	void createNewUser1ByAdmin() {
		Map<String, String> personalData = Map.of("username", username1, "password", password1, "role", Roles.USER.toString());
		given()
				.spec(RequestSpecs.unauthSpec())
				.auth().preemptive().basic("admin", "admin")
				.body(personalData)
				.post("/api/v1/admin/users")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_CREATED)
				.body("username", Matchers.equalTo(username1))
				.body("password", Matchers.not(Matchers.equalTo(password1)))
				.body("role", Matchers.equalTo(Roles.USER.toString()));

		given()
				.spec(RequestSpecs.authAsUser(username1, password1))
				.get("/api/v1/customer/profile")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id", Matchers.notNullValue())
				.body("username", Matchers.notNullValue())
				.body("password", Matchers.notNullValue())
				.body("role", Matchers.equalTo(Roles.USER.toString()));
	}

	void createNewUser2ByAdmin() {
		Map<String, String> personalData = Map.of("username", username2, "password", password2, "role", Roles.USER.toString());
		given()
				.spec(RequestSpecs.unauthSpec())
				.auth().preemptive().basic("admin", "admin")
				.body(personalData)
				.post("/api/v1/admin/users")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_CREATED)
				.body("username", Matchers.equalTo(username2))
				.body("password", Matchers.not(Matchers.equalTo(password2)))
				.body("role", Matchers.equalTo(Roles.USER.toString()));

		given()
				.spec(RequestSpecs.authAsUser(username2, password2))
				.get("/api/v1/customer/profile")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id", Matchers.notNullValue())
				.body("username", Matchers.notNullValue())
				.body("password", Matchers.notNullValue())
				.body("role", Matchers.equalTo(Roles.USER.toString()));
	}

	int createAccount1() {
		return given()
				.spec(RequestSpecs.authAsUser(username1, password1))
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

	int createAccount2() {
		return given()
				.spec(RequestSpecs.authAsUser(username2, password2))
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

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(1.25, "Invalid transfer: insufficient funds or invalid accounts"),
				Arguments.of(10000.01, "Transfer amount cannot exceed 10000"),
				Arguments.of(10000.00, "Invalid transfer: insufficient funds or invalid accounts")
		);
	}


	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferNegativeTests(double amount, String errorMessage) {
		DepositRequest depositRequest = new DepositRequest(senderAccountId, 0.1);
		depositRequester.post(depositRequest);

		double balanceBeforeTransaction = profileRequester.get().extract().jsonPath().getDouble("accounts.find { it.id == " + senderAccountId + " }.balance");

		TransferRequest transferRequest = new TransferRequest(senderAccountId, receiverAccountId, amount);

		transferBad.post(transferRequest)
				.assertThat()
				.body(Matchers.containsString(errorMessage));

		double balanceAfterTransaction = profileRequester.get().extract().jsonPath().getDouble("accounts.find { it.id == " + senderAccountId + " }.balance");
		assertThat(balanceAfterTransaction, is(balanceBeforeTransaction));

		transferOk.get(senderAccountId)
				.body("id", Matchers.notNullValue())
				.body("amount", Matchers.notNullValue())
				.body("timestamp", Matchers.notNullValue())
				.body("relatedAccountId", Matchers.notNullValue());
	}
}

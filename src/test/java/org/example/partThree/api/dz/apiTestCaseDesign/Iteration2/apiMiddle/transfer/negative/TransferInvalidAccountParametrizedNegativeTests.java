package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.transfer.negative;

import org.apache.http.HttpStatus;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.TransferRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.AdminCreateUserRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.CreateAccountRequester;
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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TransferInvalidAccountParametrizedNegativeTests extends BaseTest {
	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();

	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	int receiverAccountId_INVALID_ACCOUNT;
	int senderAccountId;
	double balance = 5000.00;

	@BeforeEach
	void setUp() {
		// создание первого пользователя
		CreateUserRequest createUserRequest1 = CreateUserRequest
				.builder()
				.username(username1)
				.password(password1)
				.role(Roles.USER.toString())
				.build();

		new AdminCreateUserRequester(
				RequestSpecs.adminSpec(),
				ResponseSpecs.entityWasCreated())
				.post(createUserRequest1);

		// создание второго пользователя
		CreateUserRequest createUserRequest2 = CreateUserRequest
				.builder()
				.username(username2)
				.password(password2)
				.role(Roles.USER.toString())
				.build();

		new AdminCreateUserRequester(
				RequestSpecs.adminSpec(),
				ResponseSpecs.entityWasCreated())
				.post(createUserRequest2);


		// создание счёта первого пользователя (плательщика)
		senderAccountId = new CreateAccountRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.entityWasCreated())
				.post(null)
				.extract()
				.path("id");


		// депозит средств на счёт первого пользователя (плательщика) - захардкодил balance=5000, чтобы в рамках данных тестов денег на счёте точно хватило для перевода, иначе тест будет падать из-за нехватки средств
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(senderAccountId)
				.balance(balance)
				.build();

		new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.post(depositRequest);
	}

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(1.25, "Invalid transfer: insufficient funds or invalid accounts"),
				Arguments.of(10000.00, "Invalid transfer: insufficient funds or invalid accounts")
		);
	}


	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferNegativeTests(double amount, String errorMessage) {
		TransferRequest transferRequest = TransferRequest.builder()
				.senderAccountId(senderAccountId)
				.receiverAccountId(receiverAccountId_INVALID_ACCOUNT)
				.amount(amount)
				.build();

		String messageAfterRequest = new TransferRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsBadRequest())
				.post(transferRequest)
				.extract()
				.asString();

		softly.assertThat(messageAfterRequest).isEqualTo(errorMessage);
	}
}

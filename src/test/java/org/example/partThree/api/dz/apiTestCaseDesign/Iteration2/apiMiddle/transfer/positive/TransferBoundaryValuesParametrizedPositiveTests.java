package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.transfer.positive;

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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TransferBoundaryValuesParametrizedPositiveTests extends BaseTest {
	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();

	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	int receiverAccountId;
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

		// создание счёта второго пользователя (получателя)
		receiverAccountId = new CreateAccountRequester(
				RequestSpecs.authAsUser(username2, password2),
				ResponseSpecs.entityWasCreated())
				.post(null)
				.extract()
				.path("id");


		// депозит средств на счёт первого пользователя (плательщика) - захардкодил balance=5000 и сделал цикл на три итерации, чтобы в рамках данных тестов денег на счёте точно хватило для перевода, иначе тест будет падать из-за нехватки средств
		for (int i = 0; i < 3; i++) {
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
	}

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(1.25),
				Arguments.of(9999.99),
				Arguments.of(10000.00),
				Arguments.of(0.01)
		);
	}

	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferPositiveTests(double amount) {
		TransferRequest transferRequest = TransferRequest.builder()
				.senderAccountId(senderAccountId)
				.receiverAccountId(receiverAccountId)
				.amount(amount)
				.build();

		String messageAfterRequest = new TransferRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.post(transferRequest)
				.extract()
				.path("message");

		softly.assertThat(messageAfterRequest).isEqualTo("Transfer successful");
	}
}

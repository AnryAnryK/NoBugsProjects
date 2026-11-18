package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.transfer.positive;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.*;
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

import java.util.Arrays;
import java.util.stream.Stream;

public class TransferBoundaryValuesParametrizedPositiveTests extends BaseTest {
	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();

	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	DepositResponse receiverAccountId;
	DepositResponse senderAccountId;
	double setBalance5000 = RandomData.setBalance5000();
	static final double setAmount9999and99 = RandomData.setAmount9999and99();
	static final double setAmount10000 = RandomData.setAmount10000();
	static final double setAmount00and01 = RandomData.setAmount00and01();
	static final double setAmount = RandomData.setAmount();

	static final String transferSuccessful = AlertMessages.Transfer.TRANSFER_SUCCESSFUL.getMessage();

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
				.post()
				.extract()
				.as(DepositResponse.class);


		// создание счёта второго пользователя (получателя)
		receiverAccountId = new CreateAccountRequester(
				RequestSpecs.authAsUser(username2, password2),
				ResponseSpecs.entityWasCreated())
				.post()
				.extract()
				.as(DepositResponse.class);


		// депозит средств на счёт первого пользователя (плательщика) - захардкодил balance=5000 и сделал цикл на три итерации, т.к. сделать депозит на сумму более 5000 невозможно из-за ограничений по документации, чтобы в рамках данных тестов денег на счёте точно хватило для перевода, иначе тест будет падать из-за нехватки средств
		for (int i = 0; i < 3; i++) {
			DepositRequest depositRequest = DepositRequest
					.builder()
					.id(senderAccountId.getId())
					.balance(setBalance5000)
					.build();

			new DepositRequester(
					RequestSpecs.authAsUser(username1, password1),
					ResponseSpecs.requestReturnsOK())
					.post(depositRequest);
		}
	}

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(setAmount),
				Arguments.of(setAmount9999and99),
				Arguments.of(setAmount10000),
				Arguments.of(setAmount00and01)
		);
	}

	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferPositiveTests(double amount) {
		//сумма на счёте после депозита
		DepositResponse[] accountsBeforeTransfer = new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		DepositResponse balanceBeforeTransfer = Arrays.stream(accountsBeforeTransfer)
				.filter(balance -> balance.getId() == senderAccountId.getId()).findFirst().orElseThrow();

		TransferRequest transferRequest = TransferRequest.builder()
				.senderAccountId(senderAccountId.getId())
				.receiverAccountId(receiverAccountId.getId())
				.amount(amount)
				.build();

		TransferResponse messageAfterRequest = new TransferRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.post(transferRequest)
				.extract()
				.as(TransferResponse.class);
		softly.assertThat(messageAfterRequest.getMessage()).isEqualTo(transferSuccessful);

		//сумма на счёте после трансфера
		DepositResponse[] accountsAfterTransfer = new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		DepositResponse balanceAfterTransfer = Arrays.stream(accountsAfterTransfer)
				.filter(balance -> balance.getId() == senderAccountId.getId()).findFirst().orElseThrow();

		//сверка сумм до и после в подтверждение произведённого трансфера
		softly.assertThat(balanceAfterTransfer.getBalance())
				.isEqualTo(balanceBeforeTransfer.getBalance() - amount);
	}
}

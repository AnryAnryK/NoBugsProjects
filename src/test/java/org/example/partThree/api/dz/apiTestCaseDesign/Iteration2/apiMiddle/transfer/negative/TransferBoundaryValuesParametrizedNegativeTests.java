package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.transfer.negative;

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

public class TransferBoundaryValuesParametrizedNegativeTests extends BaseTest {
	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();

	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	DepositResponse receiverAccountId;
	DepositResponse senderAccountId;
	static final double setAmount00and01 = RandomData.setAmount00and01();
	static final double setAmount = RandomData.setAmount();
	static final double setAmount10000 = RandomData.setAmount10000();
	static final double setAmountMore10000 = RandomData.setAmountMore10000();

	static final String invalidTransferInsufficientFundsOrInvalidAccounts = AlertMessages.Transfer.INVALID_TRANSFER_INSUFFICIENT_FUNDS_OR_INVALID_ACCOUNTS.getMessage();
	static final String transferAmountCannotExceed10000 = AlertMessages.Transfer.TRANSFER_AMOUNT_CANNOT_EXCEED_10000.getMessage();

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


		// депозит средств на счёт первого пользователя (плательщика) - захардкодил, чтобы денег на счёте точно не хватило и тест упал (как ожидаемое поведение)
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(senderAccountId.getId())
				.balance(setAmount00and01)
				.build();

		new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.post(depositRequest);
	}

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(setAmount, invalidTransferInsufficientFundsOrInvalidAccounts),
				Arguments.of(setAmountMore10000, transferAmountCannotExceed10000,
						Arguments.of(setAmount10000, invalidTransferInsufficientFundsOrInvalidAccounts)
				));
	}

	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferNegativeTests(double amount, String errorMessage) {
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

		String messageAfterRequest = new TransferRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsBadRequest())
				.post(transferRequest)
				.extract()
				.asString();
		softly.assertThat(messageAfterRequest).isEqualTo(errorMessage);

		//сумма на счёте после трансфера
		DepositResponse[] accountsAfterTransfer = new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		DepositResponse balanceAfterTransfer = Arrays.stream(accountsAfterTransfer)
				.filter(balance -> balance.getId() == senderAccountId.getId()).findFirst().orElseThrow();

		//сверка неизменности сумм до и после
		softly.assertThat(balanceAfterTransfer.getBalance())
				.isEqualTo(balanceBeforeTransfer.getBalance());
	}
}

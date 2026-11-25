package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.transfer.negative;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.TransferResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.CreateAccountByUserStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.CreateUserByAdminStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.DepositStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.TransferStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;
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

	long receiverAccountId;
	long senderAccountId;
	static final double setAmount00and01 = 0.01;
	static final double setAmount = RandomData.getAmount();
	static final double setAmount10000 = 10000.00;
	static final double setAmountMore10000 = RandomData.getAmountMore10000();

	static final String invalidTransferInsufficientFundsOrInvalidAccounts = AlertMessages.Transfer.INVALID_TRANSFER_INSUFFICIENT_FUNDS_OR_INVALID_ACCOUNTS.getMessage();
	static final String transferAmountCannotExceed10000 = AlertMessages.Transfer.TRANSFER_AMOUNT_CANNOT_EXCEED_10000.getMessage();

	@BeforeEach
	void setUp() {
		// создание пользователя 1
		CreateUserByAdminStep createUserByAdminStep1 = new CreateUserByAdminStep();
		createUserByAdminStep1.createUserByAdmin();
		this.username1 = createUserByAdminStep1.username;
		this.password1 = createUserByAdminStep1.password;

		// создание пользователя 2
		CreateUserByAdminStep createUserByAdminStep2 = new CreateUserByAdminStep();
		createUserByAdminStep2.createUserByAdmin();
		this.username2 = createUserByAdminStep2.username;
		this.password2 = createUserByAdminStep2.password;


		// создание счёта пользователя 1 (плательщика)
		CreateAccountByUserStep createAccountByUserStep1 = new CreateAccountByUserStep(username1, password1);
		createAccountByUserStep1.createAccountByUser();
		this.senderAccountId = createAccountByUserStep1.accountId;

		// создание счёта пользователя 2 (получателя)
		CreateAccountByUserStep createAccountByUserStep2 = new CreateAccountByUserStep(username2, password2);
		createAccountByUserStep2.createAccountByUser();
		this.receiverAccountId = createAccountByUserStep2.accountId;


		// депозит средств на счёт пользователя 1 (плательщика) - захардкодил, чтобы денег на счёте точно не хватило и тест упал (как ожидаемое поведение)
		DepositStep depositStep = new DepositStep(username1, password1, senderAccountId, setAmount00and01);
		depositStep.addDeposit();
	}

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(setAmount, invalidTransferInsufficientFundsOrInvalidAccounts),
				Arguments.of(setAmountMore10000, transferAmountCannotExceed10000),
						Arguments.of(setAmount10000, invalidTransferInsufficientFundsOrInvalidAccounts)
				);
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
				.filter(balance -> balance.getId() == senderAccountId).findFirst().orElseThrow();

		//трансфер
		TransferStep transferStep = new TransferStep(username1, password1, senderAccountId, receiverAccountId, amount);
		String messageAfterRequest = transferStep.makeInvalidTransfer();
		softly.assertThat(messageAfterRequest).isEqualTo(errorMessage);

		//сумма на счёте после трансфера
		DepositResponse[] accountsAfterTransfer = new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		DepositResponse balanceAfterTransfer = Arrays.stream(accountsAfterTransfer)
				.filter(balance -> balance.getId() == senderAccountId).findFirst().orElseThrow();

		//сверка неизменности сумм до и после
		softly.assertThat(balanceAfterTransfer.getBalance())
				.isEqualTo(balanceBeforeTransfer.getBalance());
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.transfer.negative;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositResponse;
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

public class TransferInvalidAccountParametrizedNegativeTests extends BaseTest {
	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();

	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	long receiverAccountId_INVALID_ACCOUNT = RandomData.getInvalidAccountId();
	long senderAccountId;
	static final double setAmount10000 = 10000.00;
	static final double setBalance5000 = 5000.00;
	static final double setAmount = RandomData.getAmount();

	static final String invalidTransferInsufficientFundsOrInvalidAccounts = AlertMessages.Transfer.INVALID_TRANSFER_INSUFFICIENT_FUNDS_OR_INVALID_ACCOUNTS.getMessage();

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


		// депозит средств на счёт пользователя 1 (плательщика) - захардкодил balance=5000, чтобы в рамках данных тестов денег на счёте точно хватило для перевода, иначе тест будет падать из-за нехватки средств
		DepositStep depositStep = new DepositStep(username1, password1, senderAccountId, setBalance5000);
		depositStep.addDeposit();
	}

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(setAmount, invalidTransferInsufficientFundsOrInvalidAccounts),
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
				.filter(balance -> balance.getId() == senderAccountId)
				.findFirst()
				.orElseThrow();

		//трансфер
		TransferStep transferStep = new TransferStep(username1, password1, senderAccountId, receiverAccountId_INVALID_ACCOUNT, amount);
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
				.filter(balance -> balance.getId() == senderAccountId)
				.findFirst()
				.orElseThrow();

		//сверка неизменности сумм до и после
		softly.assertThat(balanceAfterTransfer).isEqualTo(balanceBeforeTransfer);
	}
}

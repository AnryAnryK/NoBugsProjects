package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.transfer.positive;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.TransferRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.TransferResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.TransferRequester;
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

public class TransferBoundaryValuesParametrizedPositiveTests extends BaseTest {
	String username1 = RandomData.getUsername();
	String password1 = RandomData.getPassword();
	String username2 = RandomData.getUsername();
	String password2 = RandomData.getPassword();

	long receiverAccountId;
	long senderAccountId;
	double balance;
	double amount;
	double setBalance5000 = 5000;
	static final double setAmount9999and99 = 9999.99;
	static final double setAmount10000 = 10000.00;
	static final double setAmount00and01 = 0.01;
	static final double setAmount = RandomData.getAmount();
	static final String transferSuccessful = AlertMessages.Transfer.TRANSFER_SUCCESSFUL.getMessage();

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


		// депозит средств на счёт пользователя 1 (плательщика) - захардкодил balance=5000 и сделал цикл на три итерации, т.к. сделать депозит на сумму более 5000 невозможно из-за ограничений по документации, чтобы в рамках данных тестов денег на счёте точно хватило для перевода, иначе тест будет падать из-за нехватки средств
		for (int i = 0; i < 3; i++) {
			DepositStep depositStep = new DepositStep(username1, password1, senderAccountId, setBalance5000);
			depositStep.addDeposit();
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
				.filter(balance -> balance.getId() == senderAccountId).findFirst().orElseThrow();


		// трансфер
		TransferStep transferStep = new TransferStep(username1, password1, senderAccountId, receiverAccountId, amount);
		TransferResponse messageAfterRequest = transferStep.makeTransfer();
		softly.assertThat(messageAfterRequest.getMessage()).isEqualTo(transferSuccessful);


		//сумма на счёте после трансфера
		DepositResponse[] accountsAfterTransfer = new DepositRequester(
				RequestSpecs.authAsUser(username1, password1),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		DepositResponse balanceAfterTransfer = Arrays.stream(accountsAfterTransfer)
				.filter(balance -> balance.getId() == senderAccountId).findFirst().orElseThrow();

//		сверка сумм до и после в подтверждение произведённого трансфера
		softly.assertThat(balanceAfterTransfer.getBalance())
				.isEqualTo(balanceBeforeTransfer.getBalance() - amount);
	}
}

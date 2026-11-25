package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.deposit.negative;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.CreateAccountByUserStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.CreateUserByAdminStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.DepositStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class DepositParametrizedSumNegativeTests extends BaseTest {
	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	long accountId;
	static final String DepositAmountMustBeAtLeast001 = AlertMessages.Deposit.DEPOSIT_AMOUNT_MUST_BE_AT_LEAST_001.getMessage();
	static final String DepositAmountCannotExceed5000 = AlertMessages.Deposit.DEPOSIT_AMOUNT_CANNOT_EXCEED_5000.getMessage();
	static final double setBalance0 = 0;
	static final double setBalanceMinus0 = RandomData.getBalanceMinus0();
	static final double setBalanceUnderMax5000 = RandomData.getBalanceMoreThanMax5000();

	@BeforeEach
	void setUp() {
		// создание пользователя
		CreateUserByAdminStep createUserByAdminStep = new CreateUserByAdminStep();
		createUserByAdminStep.createUserByAdmin();
		this.username = createUserByAdminStep.username;
		this.password = createUserByAdminStep.password;

		// создание счёта пользователя
		CreateAccountByUserStep createAccountByUserStep = new CreateAccountByUserStep(username, password);
		createAccountByUserStep.createAccountByUser();
		this.accountId = createAccountByUserStep.accountId;
	}

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(setBalance0, DepositAmountMustBeAtLeast001),
				Arguments.of(setBalanceUnderMax5000, DepositAmountCannotExceed5000),
				Arguments.of(setBalanceMinus0, DepositAmountMustBeAtLeast001)
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectSumNegativeTests(double balance, String errMessage) {
		// сумма на счету до депозита
		DepositResponse[] accountsBeforeDeposit = new DepositRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		double balanceBeforeDeposit = Arrays.stream(accountsBeforeDeposit)
				.filter(accId -> accId.getId() == accountId)
				.findFirst()
				.orElseThrow()
				.getBalance();

		// попытка депозита
		DepositStep depositStep = new DepositStep(username, password, accountId, balance);
		String errorInResponse = depositStep.addInvalidSumDeposit();
		softly.assertThat(errMessage).isEqualTo(errorInResponse);

		//сверка неизменности суммы на счёте отправителя
		DepositResponse[] accountsAfterDeposit = new DepositRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(DepositResponse[].class);

		double balanceAfterDeposit = Arrays.stream(accountsAfterDeposit)
				.filter(accId -> accId.getId() == accountId)
				.findFirst()
				.orElseThrow()
				.getBalance();
		softly.assertThat(balanceBeforeDeposit).isEqualTo(balanceAfterDeposit);
	}
}

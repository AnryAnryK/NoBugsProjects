package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.deposit.positive;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositRequest;
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

import static org.assertj.core.api.AssertionsForClassTypes.within;

public class DepositParametrizedPositiveSeniorTests extends BaseTest {
	String username;
	String password;
	long accountId;
	static final double setRandomBalance = RandomData.getBalance();
	static final double setBalance5000 = 5000.00;
	static final double setBalance4999and99 = 4999.99;
	static final double setAmount00and01 = 0.01;

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
				Arguments.of(setRandomBalance),
				Arguments.of(setBalance5000),
				Arguments.of(setBalance4999and99),
				Arguments.of(setAmount00and01)
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositPositiveTests(double balance) {
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

		// депозит
		DepositStep depositStep = new DepositStep(username, password, accountId, balance);
		DepositResponse depositResponse = depositStep.addDeposit();

		//сверка сумм до и после в подтверждение произведённого депозита
		softly.assertThat(depositResponse
						.getBalance())
				.isCloseTo(balanceBeforeDeposit + balance, within(0.01));
	}
}

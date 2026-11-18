package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.deposit.positive;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.AdminCreateUserRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.CreateAccountRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.DepositRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.ResponseSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateAccountResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DepositParametrizedPositiveTests extends BaseTest {
	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	long accountId;
	static final double setRandomBalance = RandomData.setBalance();
	static final double setBalance5000 = RandomData.setBalance5000();
	static final double setBalance4999and99 = RandomData.setBalance4999and99();
	static final double setAmount00and01 = RandomData.setAmount00and01();

	@BeforeEach
	void setUp() {
		// создание пользователя
		CreateUserRequest createUserRequest = CreateUserRequest
				.builder()
				.username(username)
				.password(password)
				.role(Roles.USER.toString())
				.build();

		new AdminCreateUserRequester(
				RequestSpecs.adminSpec(),
				ResponseSpecs.entityWasCreated())
				.post(createUserRequest);

		// создание счёта пользователя
		accountId = new CreateAccountRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.entityWasCreated())
				.post()
				.extract()
				.as(CreateAccountResponse.class)
				.getId();
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

		double balanceBeforeDeposit = accountsBeforeDeposit[0].getBalance();

		// депозит
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(accountId)
				.balance(balance)
				.build();

		// сумма на депозите после .post: сверяем равенство сумм
		DepositResponse depositResponse = new DepositRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.post(depositRequest)
				.extract()
				.as(DepositResponse.class);

		//сверка сумм до и после в подтверждение произведённого депозита
		softly.assertThat(depositResponse
						.getBalance())
				.isEqualTo(balanceBeforeDeposit + balance);
	}
}

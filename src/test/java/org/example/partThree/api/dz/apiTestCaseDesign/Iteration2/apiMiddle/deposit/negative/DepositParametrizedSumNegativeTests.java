package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.deposit.negative;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.messages.AlertMessages;
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class DepositParametrizedSumNegativeTests extends BaseTest {
	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	DepositResponse depositResponse;
	static final String DepositAmountMustBeAtLeast001 = AlertMessages.Deposit.DEPOSIT_AMOUNT_MUST_BE_AT_LEAST_001.getMessage();
	static final String DepositAmountCannotExceed5000 = AlertMessages.Deposit.DEPOSIT_AMOUNT_CANNOT_EXCEED_5000.getMessage();
	static final double setBalance0 = RandomData.setBalance0();
	static final double setBalanceMinus0 = RandomData.setBalanceMinus0();
	static final double setBalanceUnderMax5000 = RandomData.setBalanceUnderMax5000();

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
		depositResponse = new CreateAccountRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.entityWasCreated())
				.post()
				.extract()
				.as(DepositResponse.class);
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
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(depositResponse.getId())
				.balance(balance)
				.build();

		String errorInResponse = new DepositRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsBadRequest())
				.post(depositRequest)
				.extract()
				.body()
				.asString();
		softly.assertThat(errMessage).isEqualTo(errorInResponse);

		DepositResponse[] balanceAfterDepositOnInvalidAccount = new DepositRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.body()
				.as(DepositResponse[].class);

		softly.assertThat(balanceAfterDepositOnInvalidAccount[0]
						.getBalance())
				.isEqualTo(0.0);
	}
}

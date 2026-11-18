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

public class DepositParametrizedAccountNegativeTests extends BaseTest {
	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	static final double setRandomBalance = RandomData.setBalance();
	static final String errorMessage = AlertMessages.Profile.UNAUTHORISED_ACCESS_TO_ACCOUNT.getMessage();
	static final long invalidAccountId = RandomData.setInvalidAccountId();

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
		new CreateAccountRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.entityWasCreated())
				.post();
	}

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(invalidAccountId, setRandomBalance, errorMessage),
				Arguments.of(invalidAccountId, setRandomBalance, errorMessage)
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectAccountNegativeTests(long id, double balance, String errMessage) {
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(id)
				.balance(balance)
				.build();

		String errorInResponse = new DepositRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsBad403Request())
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

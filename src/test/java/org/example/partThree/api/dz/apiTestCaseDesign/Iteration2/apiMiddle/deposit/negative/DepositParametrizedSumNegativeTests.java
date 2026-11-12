package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.deposit.negative;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.DepositRequest;
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
	int accountId;

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
				.post(null)
				.extract()
				.path("id");
	}

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(0, "Deposit amount must be at least 0.01"),
				Arguments.of(5000.01, "Deposit amount cannot exceed 5000"),
				Arguments.of(-50.99, "Deposit amount must be at least 0.01")
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectSumNegativeTests(double balance, String errMessage) {
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(accountId)
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
	}
}

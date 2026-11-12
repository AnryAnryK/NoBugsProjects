package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.deposit.negative;

import io.restassured.response.ValidatableResponse;
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

public class DepositParametrizedAccountNegativeTests extends BaseTest {
	String username = RandomData.getUsername();
	String password = RandomData.getPassword();

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
				.post(null);
	}

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(1515, 50.01, "Unauthorized access to account"),
				Arguments.of(4, 0.01, "Unauthorized access to account")
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectAccountNegativeTests(int id, double balance, String errMessage) {

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
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.customerName.negative;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CustomerNameRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.AdminCreateUserRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.ProfileRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UpdateCustomerNameParametrizedNegativeTests extends BaseTest {
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
	}

	public static Stream<Arguments> updateCustomerName() {
		return Stream.of(
				Arguments.of("Aabbcc    New", "Name must contain two words with letters only"),
				Arguments.of("", "Name must contain two words with letters only"),
				Arguments.of("Aabbcc $", "Name must contain two words with letters only")
		);
	}

	@MethodSource("updateCustomerName")
	@ParameterizedTest
	public void updateCustomerNameNegativeTests(String name, String errorMessage) {
		// авторизация пользователя с последующей попыткой смены имени пользователя на некорректное (ожидаем отрицательный результат)
		CustomerNameRequest customerNameRequest = CustomerNameRequest
				.builder()
				.name(name)
				.build();

		String customerNameResponse = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsBadRequest())
				.put(customerNameRequest)
				.extract()
				.body()
				.asString();
		softly.assertThat(customerNameResponse).isEqualTo(errorMessage);
	}
}

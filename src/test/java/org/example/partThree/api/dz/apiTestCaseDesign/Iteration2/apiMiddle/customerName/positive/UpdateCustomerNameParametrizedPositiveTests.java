package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.customerName.positive;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CustomerNameRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.AdminCreateUserRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.ProfileRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.ResponseSpecs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UpdateCustomerNameParametrizedPositiveTests extends BaseTest {
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
				Arguments.of("Aabbcc New"),
				Arguments.of("a b"),
				Arguments.of("Aabbccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb")
		);
	}

	@MethodSource("updateCustomerName")
	@ParameterizedTest
	public void updateCustomerNamePositiveTests(String name) {
		// авторизация пользователя с последующей сменой имени пользователя на корректное (ожидаем положительный результат)
		CustomerNameRequest customerNameRequest = CustomerNameRequest
				.builder()
				.name(name)
				.build();

		String customerNameResponse = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.put(customerNameRequest)
				.extract()
				.path("customer.name");
		softly.assertThat(customerNameResponse).isEqualTo(name);
	}
}

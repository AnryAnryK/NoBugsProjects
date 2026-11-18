package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.customerName.positive;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CustomerNameRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CustomerNameResponse;
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
	static final String actualMessageValidation = AlertMessages.Profile.PROFILE_UPDATED_SUCCESSFULLY.getMessage();
	static final String changeOnValidUsername10Plus10Characters = RandomData.getNewUsername10Plus10Characters();
	static final String changeOnValidUsername30Plus30Characters = RandomData.getNewUsername30Plus30Characters();
	static final String changeOnValidUsername1Plus1Characters = RandomData.getNewUsername1Plus1Characters();

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
				Arguments.of(changeOnValidUsername10Plus10Characters),
				Arguments.of(changeOnValidUsername1Plus1Characters),
				Arguments.of(changeOnValidUsername30Plus30Characters)
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

		String customerNameMessageResponse = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.put(customerNameRequest)
				.extract()
				.as(CustomerNameResponse.class)
				.getMessage();
		softly.assertThat(customerNameMessageResponse).isEqualTo(actualMessageValidation);

		//проверяем через .get что имя поменялось на новое корректное
		String actualName = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(CustomerNameResponse.class)
				.getName();
		softly.assertThat(actualName).isEqualTo(name);
	}
}

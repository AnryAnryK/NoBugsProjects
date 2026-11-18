package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.customerName.negative;

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

public class UpdateCustomerNameParametrizedNegativeTests extends BaseTest {
	String username = RandomData.getUsername();
	String password = RandomData.getPassword();
	static final String errorNewNameMessage = AlertMessages.Profile.ERROR_NAME_NOT_TWO_WORDS_WITH_LETTERS.getMessage();

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
				Arguments.of(RandomData.getInvalidUsernameWithSpaces(), errorNewNameMessage),
				Arguments.of(RandomData.getInvalidEmptyUsername(), errorNewNameMessage),
				Arguments.of(RandomData.getInvalidUsernameWithSymbol(), errorNewNameMessage)
		);
	}

	@MethodSource("updateCustomerName")
	@ParameterizedTest
	public void updateCustomerNameNegativeTests(String invalidName, String errorMessage) {
		// берём текущее имя и сохраняем в переменную с целью последующей сверки и именем после .put
		ProfileRequester profileRequester = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK());

		String nameBeforePut = profileRequester
				.get()
				.extract()
				.as(CustomerNameResponse.class)
				.getName();

		// авторизация пользователя с последующей попыткой смены имени пользователя на некорректное (ожидаем отрицательный результат)
		CustomerNameRequest customerNameRequest = CustomerNameRequest
				.builder()
				.name(invalidName)
				.build();

		String customerNameResponse = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsBadRequest())
				.put(customerNameRequest)
				.extract()
				.body()
				.asString();
		softly.assertThat(customerNameResponse).isEqualTo(errorMessage);

		//проверяем через .get что имя НЕ поменялось на новое некорректное
		String actualName = new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.get()
				.extract()
				.as(CustomerNameResponse.class)
				.getName();
		softly.assertThat(actualName).isEqualTo(nameBeforePut);
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.customerName.negative;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.messages.AlertMessages;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CustomerNameResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.ProfileRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.CreateUserByAdminStep;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps.CustomerUpdateNameStep;
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
	static final String errorNewNameMessage = AlertMessages.Profile.ERROR_NAME_NOT_TWO_WORDS_WITH_LETTERS.getMessage();

	@BeforeEach
	void setUp() {
		// создание пользователя
		CreateUserByAdminStep createUserByAdminStep = new CreateUserByAdminStep();
		createUserByAdminStep.createUserByAdmin();
		this.username = createUserByAdminStep.username;
		this.password = createUserByAdminStep.password;
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
		CustomerUpdateNameStep customerUpdateNameStep = new CustomerUpdateNameStep(username, password, invalidName);
		String customerChangeNameMessageResponse = customerUpdateNameStep.customerInvalidUpdateName();
		softly.assertThat(customerChangeNameMessageResponse).isEqualTo(errorMessage);

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

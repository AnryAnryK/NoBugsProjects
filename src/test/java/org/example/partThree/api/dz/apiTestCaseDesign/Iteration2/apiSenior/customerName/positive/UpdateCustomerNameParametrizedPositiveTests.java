package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.customerName.positive;

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
		CreateUserByAdminStep createUserByAdminStep = new CreateUserByAdminStep();
		createUserByAdminStep.createUserByAdmin();
		this.username = createUserByAdminStep.username;
		this.password = createUserByAdminStep.password;
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
		CustomerUpdateNameStep customerUpdateNameStep = new CustomerUpdateNameStep(username, password, name);
		String customerNameMessageResponse = customerUpdateNameStep.customerUpdateName();
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

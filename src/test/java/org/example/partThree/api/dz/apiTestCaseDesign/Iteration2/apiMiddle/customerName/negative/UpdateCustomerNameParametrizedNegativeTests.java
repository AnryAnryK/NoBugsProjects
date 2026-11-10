package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.customerName.negative;

import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.BaseTest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CustomerNameRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests.ProfileRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs.ResponseSpecs;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class UpdateCustomerNameParametrizedNegativeTests extends BaseTest {
	private ProfileRequester okProfileRequester;
	private ProfileRequester badProfileRequester;

	String username = RandomData.getUsername();
	String password = RandomData.getPassword();

	@BeforeEach
	void setUp() {
		createNewUserByAdmin();
		RequestSpecification requestSpecification = RequestSpecs.authAsUser(username, password);
		okProfileRequester = new ProfileRequester(requestSpecification, ResponseSpecs.requestReturnsOK());
		badProfileRequester = new ProfileRequester(requestSpecification, ResponseSpecs.requestReturnsBadRequest());
	}

	void createNewUserByAdmin() {
		Map<String, String> personalData = Map.of("username", username, "password", password, "role", Roles.USER.toString());
		given()
				.spec(RequestSpecs.unauthSpec())
				.auth().preemptive().basic("admin", "admin")
				.body(personalData)
				.post("/api/v1/admin/users")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_CREATED)
				.body("username", Matchers.equalTo(username))
				.body("password", Matchers.not(Matchers.equalTo(password)))
				.body("role", Matchers.equalTo(Roles.USER.toString()));

		given()
				.spec(RequestSpecs.authAsUser(username, password))
				.get("/api/v1/customer/profile")
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id", Matchers.notNullValue())
				.body("username", Matchers.notNullValue())
				.body("password", Matchers.notNullValue())
				.body("role", Matchers.equalTo(Roles.USER.toString()));
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

		CustomerNameRequest customerNameRequest = new CustomerNameRequest(name);
		String nameBefore = okProfileRequester.get().extract().path("name");

		badProfileRequester.put(customerNameRequest)
				.body(Matchers.containsString(errorMessage));

		okProfileRequester.get()
				.body("name", Matchers.equalTo(nameBefore));
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.util_notForChecking;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer.RandomData;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateAccountTest {

	@Test
	void createAccountTest() {

		String username = RandomData.getUsername();
		String password = RandomData.getPassword();

		Map<String, String> personalData = Map.of("username", username, "password",password, "role", Roles.USER.toString());

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic("admin", "admin")
				.log().all()
				.body(personalData)
				.post("http://localhost:4111/api/v1/admin/users")
				.then()
				.log().all()
				.assertThat()
				.statusCode(HttpStatus.SC_CREATED)
				.body("username", Matchers.equalTo(username))
				.body("password", Matchers.not(Matchers.equalTo(password)))
				.body("role", Matchers.equalTo(Roles.USER.toString()));

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.post("http://localhost:4111/api/v1/accounts")
				.then()
				.log().all()
				.assertThat()
				.body("id", Matchers.notNullValue())
				.body("accountNumber", Matchers.notNullValue())
				.body("balance", Matchers.notNullValue())
				.body("transactions", Matchers.notNullValue())
				.statusCode(HttpStatus.SC_CREATED);

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.get("http://localhost:4111/api/v1/customer/accounts")
				.then()
				.log().all()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id", Matchers.notNullValue())
				.body("accountNumber", Matchers.notNullValue())
				.body("balance", Matchers.notNullValue())
				.body("transactions", Matchers.notNullValue());
	}
}

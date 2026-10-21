package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CreateNewUserByAdminTest {

	@Test
	void createNewUserByAdmin() {
		String username = "Aabbcc13";
		String password = "Aabbcc13!";

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic("admin", "admin")
				.log().all()
				.body("{\n" +
						"  \"username\": \"" + username + "\",\n" +
						"  \"password\": \"" + password + "\",\n" +
						"  \"role\": \"USER\"\n" +
						"}")
				.post("http://localhost:4111/api/v1/admin/users")
				.then()
				.log().all()
				.assertThat()
				.statusCode(HttpStatus.SC_CREATED)
				.body("username", Matchers.equalTo(username))
				.body("password", Matchers.not(Matchers.equalTo(password)))
				.body("role", Matchers.equalTo("USER"));
	}
}

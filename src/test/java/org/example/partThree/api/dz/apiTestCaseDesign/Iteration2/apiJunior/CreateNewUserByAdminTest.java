package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CreateNewUserByAdminTest {

	@Test
	void createNewUserByAdmin() {
		String username = "Aabbcc19";
		String password = "Aabbcc19!";

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

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.log().all()
				.auth().preemptive().basic(username, password)
				.get("http://localhost:4111/api/v1/customer/profile")
				.then()
				.log().all()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id",Matchers.notNullValue())
				.body("username",Matchers.notNullValue())
				.body("password",Matchers.notNullValue())
				.body("role",Matchers.equalTo("USER"));
	}
}

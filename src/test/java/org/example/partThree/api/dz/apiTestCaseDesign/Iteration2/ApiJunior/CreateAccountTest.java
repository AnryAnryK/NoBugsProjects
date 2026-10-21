package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CreateAccountTest {

	@Test
	void createAccountTest() {
		String username = "Aabbcc12";
		String password = "Aabbcc12!";

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
	}
}

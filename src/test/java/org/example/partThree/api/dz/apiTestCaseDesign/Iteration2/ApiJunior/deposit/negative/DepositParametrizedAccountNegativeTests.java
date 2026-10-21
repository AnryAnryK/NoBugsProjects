package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.deposit.negative;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class DepositParametrizedAccountNegativeTests {

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(1515, 50.01, "Unauthorized access to account"),
				Arguments.of(4, 0.01, "Unauthorized access to account")
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositIncorrectSumNegativeTests(int id, double balance, String errMessage) {
		String username = "Aabbcc12";
		String password = "Aabbcc12!";

		String requestBody = String.format(
				"""
						{
						  "id": %s,
						  "balance": %s 
						}
						""", id, balance);

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.body(requestBody)
				.post("http://localhost:4111/api/v1/accounts/deposit")
				.then()
				.log().all()
				.assertThat()
				.statusCode(HttpStatus.SC_FORBIDDEN)
				.body(Matchers.containsString(errMessage));
	}
}

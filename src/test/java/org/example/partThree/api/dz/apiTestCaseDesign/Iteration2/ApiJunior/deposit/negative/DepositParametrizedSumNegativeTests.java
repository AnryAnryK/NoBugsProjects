package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.deposit.negative;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class DepositParametrizedSumNegativeTests {

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(1, 0, "Deposit amount must be at least 0.01"),
				Arguments.of(1, 5000.01, "Deposit amount cannot exceed 5000"),
				Arguments.of(1, -50.99, "Deposit amount must be at least 0.01")
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
				.statusCode(HttpStatus.SC_BAD_REQUEST)
				.body(Matchers.containsString(errMessage));
	}
}

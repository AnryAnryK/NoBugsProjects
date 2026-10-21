package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.deposit.positive;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class DepositParametrizedPositiveTests {

	public static Stream<Arguments> depositTest() {
		return Stream.of(
				Arguments.of(1, 5.01),
				Arguments.of(1, 5000.00),
				Arguments.of(1, 4999.99),
				Arguments.of(1, 0.01)
		);
	}

	@MethodSource("depositTest")
	@ParameterizedTest
	public void depositPositiveTests(int id, double balance) {
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
				.body("id", Matchers.notNullValue())
				.body("accountNumber", Matchers.notNullValue())
				.body("balance", Matchers.notNullValue())
				.body("transactions", Matchers.notNullValue())
				.body("transactions.type", Matchers.hasItem("DEPOSIT"))
				.body("transactions.timestamp", Matchers.notNullValue())
				.body("transactions.relatedAccountId", Matchers.notNullValue());
	}
}

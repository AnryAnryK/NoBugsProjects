package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.transfer.positive;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class TransferParametrizedPositiveTests {

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(1, 2, 1.25),
				Arguments.of(1, 2, 9999.99),
				Arguments.of(1, 2, 10000.00),
				Arguments.of(1, 2, 0.01)
		);
	}


	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferPositiveTests(int senderAccountId, int receiverAccountId, double amount) {
		String username = "Aabbcc12";
		String password = "Aabbcc12!";

		String requestBody = String.format(
				"""
						{
						  "senderAccountId": %s,
						  "receiverAccountId": %s,
						  "amount": %s 
						}
						""", senderAccountId, receiverAccountId, amount);

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.body(requestBody)
				.post("http://localhost:4111/api/v1/accounts/transfer")
				.then()
				.log().all()
				.statusCode(HttpStatus.SC_OK)
				.body("message", Matchers.containsString("Transfer successful"))
				.body("amount", Matchers.notNullValue());

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.get("http://localhost:4111/api/v1/accounts/1/transactions")
				.then()
				.log().all()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.body("id", Matchers.notNullValue())
				.body("amount", Matchers.notNullValue())
				.body("type", Matchers.hasItem("DEPOSIT"))
				.body("timestamp", Matchers.notNullValue())
				.body("relatedAccountId", Matchers.notNullValue());
	}
}

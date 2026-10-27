package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.transfer.negative;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class TransferParametrizedNegativeTests {

	public static Stream<Arguments> transferTest() {
		return Stream.of(
				Arguments.of(1, 4, 1.25, "Invalid transfer: insufficient funds or invalid accounts"),
				Arguments.of(1, 2, 10000.01, "Transfer amount cannot exceed 10000"),
				Arguments.of(1, 2, 10000.00, "Invalid transfer: insufficient funds or invalid accounts"),
				Arguments.of(1, 1515, 1.25, "Invalid transfer: insufficient funds or invalid accounts")
		);
	}


	@MethodSource("transferTest")
	@ParameterizedTest
	public void transferNegativeTests(int senderAccountId, int receiverAccountId, double amount, String errorMessage) {
		String username = "Aabbcc12";
		String password = "Aabbcc12!";

		String requestBody = String.format(
				"""
						{
						  "senderAccountId": %s,
						  "receiverAccountId": %s,
						  "amount": %s 
						}
						""", senderAccountId, receiverAccountId, amount, errorMessage);

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.body(requestBody)
				.post("http://localhost:4111/api/v1/accounts/transfer")
				.then()
				.log().all()
				.statusCode(HttpStatus.SC_BAD_REQUEST)
				.body(Matchers.containsString(errorMessage));

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

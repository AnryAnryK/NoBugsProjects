package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.customerName.negative;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class UpdateCustomerNameParametrizedNegativeTests {

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
		String username = "Aabbcc12";
		String password = "Aabbcc12!";

		String requestBody = String.format(
				"""
						{
						  "name": "%s"
						}
						""", name, errorMessage);

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.body(requestBody)
				.put("http://localhost:4111/api/v1/customer/profile")
				.then()
				.log().all()
				.statusCode(HttpStatus.SC_BAD_REQUEST)
				.body(Matchers.containsString(errorMessage));
	}
}

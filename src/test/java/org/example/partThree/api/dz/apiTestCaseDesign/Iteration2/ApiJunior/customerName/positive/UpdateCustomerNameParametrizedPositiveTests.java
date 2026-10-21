package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.ApiJunior.customerName.positive;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class UpdateCustomerNameParametrizedPositiveTests {

	public static Stream<Arguments> updateCustomerName() {
		return Stream.of(
				Arguments.of("Aabbcc New"),
				Arguments.of("a b"),
				Arguments.of("Aabbccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb")
		);
	}


	@MethodSource("updateCustomerName")
	@ParameterizedTest
	public void updateCustomerNamePositiveTests(String name) {
		String username = "Aabbcc12";
		String password = "Aabbcc12!";

		String requestBody = String.format(
				"""
						{
						  "name": "%s"
						}
						""", name);

		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.auth().preemptive().basic(username, password)
				.log().all()
				.body(requestBody)
				.put("http://localhost:4111/api/v1/customer/profile")
				.then()
				.log().all()
				.statusCode(HttpStatus.SC_OK)
				.body("customer.name", Matchers.containsString(name))
				.body("message", Matchers.containsString("Profile updated successfully"));
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.preemptive;

public class RequestSpecs {

	private static final String BASE_URI = "http://localhost:4111";
	private static final String adminName = "admin";
	private static final String adminPassword = "admin";

	private RequestSpecs() {
	}

	private static RequestSpecBuilder defaultRequestBuilder() {
		return new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.setAccept(ContentType.JSON)
				.addFilters(List.of(new RequestLoggingFilter(),
						new ResponseLoggingFilter()))
				.setBaseUri(BASE_URI);
	}

	public static RequestSpecification unauthSpec() {
		return defaultRequestBuilder().build();
	}

	public static RequestSpecification adminSpec() {
		return defaultRequestBuilder()
				.setAuth(preemptive().basic(adminName, adminPassword))
				.build();
	}

	public static RequestSpecification authAsUser(String username, String password) {
		return defaultRequestBuilder()
				.setAuth(preemptive().basic(username, password))
				.build();
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.configs.Config;

import java.util.List;

import static io.restassured.RestAssured.preemptive;

public class RequestSpecs {

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
				.setBaseUri(Config.getProperty("server") + Config.getProperty("apiVersion"));
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

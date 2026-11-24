package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.LoginUserRequest;

import static io.restassured.RestAssured.given;

public class LoginUserRequester extends Request<LoginUserRequest> {
	public LoginUserRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}

	public ValidatableResponse post(LoginUserRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.post("/api/v1/auth/login")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

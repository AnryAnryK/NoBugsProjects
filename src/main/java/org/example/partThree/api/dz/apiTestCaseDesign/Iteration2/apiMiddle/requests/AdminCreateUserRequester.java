package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CreateUserRequest;

import static io.restassured.RestAssured.given;

public class AdminCreateUserRequester extends Request<CreateUserRequest> {
	public AdminCreateUserRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}


	public ValidatableResponse post(CreateUserRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.post("/api/v1/admin/users")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

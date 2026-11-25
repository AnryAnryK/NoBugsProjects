package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;

import static io.restassured.RestAssured.*;

public class AdminCreateUserRequester extends Request<CreateUserRequest> {
	public AdminCreateUserRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}


	public ValidatableResponse post(CreateUserRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.post(Endpoint.ADMIN_USER.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

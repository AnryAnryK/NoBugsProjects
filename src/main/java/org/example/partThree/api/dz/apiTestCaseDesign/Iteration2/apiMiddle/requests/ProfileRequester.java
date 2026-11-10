package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.BaseModel;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.CustomerNameRequest;


import static io.restassured.RestAssured.given;

public class ProfileRequester extends Request<BaseModel> {
	public ProfileRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}

	public ValidatableResponse put(CustomerNameRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.put("/api/v1/customer/profile")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}

	public ValidatableResponse get() {
		return given()
				.spec(requestSpecification)
				.get("/api/v1/customer/profile")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

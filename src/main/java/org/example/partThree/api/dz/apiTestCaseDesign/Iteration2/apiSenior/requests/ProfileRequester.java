package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.BaseModel;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CustomerNameRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;


import static io.restassured.RestAssured.given;

public class ProfileRequester extends Request<BaseModel> {
	public ProfileRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}

	public ValidatableResponse put(CustomerNameRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.put(Endpoint.CUSTOMER.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}

	public ValidatableResponse get() {
		return given()
				.spec(requestSpecification)
				.get(Endpoint.CUSTOMER.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

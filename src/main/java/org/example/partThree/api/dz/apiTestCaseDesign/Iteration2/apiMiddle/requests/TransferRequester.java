package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.BaseModel;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.TransferRequest;

import static io.restassured.RestAssured.given;

public class TransferRequester extends Request<BaseModel> {
	public TransferRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}


	public ValidatableResponse post(TransferRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.post("/api/v1/accounts/transfer")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}

	public ValidatableResponse get(int account) {
		return given()
				.spec(requestSpecification)
				.get("/api/v1/accounts/" + account + "/transactions")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

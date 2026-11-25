package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.BaseModel;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.TransferRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;

import static io.restassured.RestAssured.given;

public class TransferRequester extends Request<BaseModel> {
	public TransferRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}


	public ValidatableResponse post(TransferRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.post(Endpoint.TRANSFER.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}

	public ValidatableResponse get(int account) {
		return given()
				.spec(requestSpecification)
				.get(Endpoint.ACCOUNTS.getUrl() + account + "/transactions")
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

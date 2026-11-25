package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;

import static io.restassured.RestAssured.given;

public class DepositRequester extends Request<DepositRequest> {

	public DepositRequester(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		super(requestSpecification, responseSpecification);
	}

	public ValidatableResponse post(DepositRequest model) {
		return given()
				.spec(requestSpecification)
				.body(model)
				.post(Endpoint.DEPOSIT.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
	public ValidatableResponse get() {
		return given()
				.spec(requestSpecification)
				.get(Endpoint.CUSTOMER_ACCOUNTS.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}
}

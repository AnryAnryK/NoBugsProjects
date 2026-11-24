package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.requesters;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.BaseModel;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.HttpRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.interfaces.CrudEndpointInterface;

import static io.restassured.RestAssured.given;

public class CrudRequester extends HttpRequest implements CrudEndpointInterface {
	public CrudRequester(RequestSpecification requestSpecification, Endpoint endpoint, ResponseSpecification responseSpecification) {
		super(requestSpecification, endpoint, responseSpecification);
	}

	@Override
	public ValidatableResponse post(BaseModel model) {
		var body = model == null ? "" : model;
		return  given()
				.spec(requestSpecification)
				.body(body)
				.post(endpoint.getUrl())
				.then()
				.assertThat()
				.spec(responseSpecification);
	}

	@Override
	public Object get(long id) {
		return null;
	}

	@Override
	public Object update(long id, BaseModel model) {
		return null;
	}

	@Override
	public Object delete(long id) {
		return null;
	}
}

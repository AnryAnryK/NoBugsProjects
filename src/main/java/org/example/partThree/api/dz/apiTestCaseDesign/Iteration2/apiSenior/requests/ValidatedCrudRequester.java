package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.BaseModel;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.HttpRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.interfaces.CrudEndpointInterface;

public class ValidatedCrudRequester<T extends BaseModel> extends HttpRequest implements CrudEndpointInterface {
	private CrudRequester crudRequester;

	public ValidatedCrudRequester(RequestSpecification requestSpecification, Endpoint endpoint, ResponseSpecification responseSpecification) {
		super(requestSpecification, endpoint, responseSpecification);
		this.crudRequester = new CrudRequester(requestSpecification, endpoint, responseSpecification);
	}

	@Override
	public T post(BaseModel model) {
		return (T) crudRequester.post(model).extract().as(endpoint.getResponseModel());
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

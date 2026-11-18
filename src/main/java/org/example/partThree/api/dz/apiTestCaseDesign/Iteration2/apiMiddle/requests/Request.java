package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.requests;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models.BaseModel;

public abstract class Request<T extends BaseModel> {
	protected RequestSpecification requestSpecification;
	protected ResponseSpecification responseSpecification;

	public Request(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
		this.requestSpecification = requestSpecification;
		this.responseSpecification = responseSpecification;
	}
}

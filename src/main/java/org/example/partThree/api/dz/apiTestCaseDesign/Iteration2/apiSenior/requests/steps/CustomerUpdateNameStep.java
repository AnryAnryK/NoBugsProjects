package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CustomerNameRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CustomerNameResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.ProfileRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;

public class CustomerUpdateNameStep {
	String username;
	String password;
	String name;

	public CustomerUpdateNameStep(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public String customerUpdateName() {
		CustomerNameRequest customerNameRequest = CustomerNameRequest
				.builder()
				.name(name)
				.build();

		return new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsOK())
				.put(customerNameRequest)
				.extract()
				.as(CustomerNameResponse.class)
				.getMessage();
	}

	public String customerInvalidUpdateName() {
		CustomerNameRequest customerNameRequest = CustomerNameRequest
				.builder()
				.name(name)
				.build();

		return new ProfileRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.requestReturnsBadRequest())
				.put(customerNameRequest)
				.extract()
				.asString();
	}
}

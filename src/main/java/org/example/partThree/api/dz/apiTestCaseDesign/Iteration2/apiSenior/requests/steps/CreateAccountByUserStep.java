package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CreateAccountResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.CreateAccountRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;

public class CreateAccountByUserStep {
	String username;
	String password;
	public long accountId;

	public CreateAccountByUserStep(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void createAccountByUser() {
		accountId = new CreateAccountRequester(
				RequestSpecs.authAsUser(username, password),
				ResponseSpecs.entityWasCreated())
				.post()
				.extract()
				.as(CreateAccountResponse.class)
				.getId();
	}
}

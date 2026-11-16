package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.ValidatedCrudRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;

public class DepositSteps {
	public static DepositRequest addDeposit() {
		DepositRequest depositRequest = new DepositRequest(RandomData.setId(), RandomData.setBalance());

		new ValidatedCrudRequester<DepositResponse>(
				RequestSpecs.authAsUser(RandomData.getUsername(), RandomData.getPassword()),
				Endpoint.DEPOSIT,
				ResponseSpecs.requestReturnsOK())
				.post(depositRequest);
		return depositRequest;
	}
}

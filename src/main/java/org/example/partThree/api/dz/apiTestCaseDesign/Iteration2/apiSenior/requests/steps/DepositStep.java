package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.DepositResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.requesters.CrudRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.requesters.ValidatedCrudRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;

public class DepositStep {
	private final String username;
	private final String password;
	private final long accountId;
	private final double balance;

	public DepositStep(String username, String password, long accountId, double balance) {
		this.username = username;
		this.password = password;
		this.accountId = accountId;
		this.balance = balance;
	}

	public DepositResponse addDeposit() {
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(accountId)
				.balance(balance)
				.build();

		return new ValidatedCrudRequester<DepositResponse>(
				RequestSpecs.authAsUser(username, password),
				Endpoint.DEPOSIT,
				ResponseSpecs.requestReturnsOK())
				.post(depositRequest);
	}

	public String addInvalidAccountDeposit() {
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(accountId)
				.balance(balance)
				.build();

		return new CrudRequester(
				RequestSpecs.authAsUser(username, password),
				Endpoint.DEPOSIT,
				ResponseSpecs.requestReturnsBad403Request())
				.post(depositRequest)
				.extract()
				.asString();
	}

	public String addInvalidSumDeposit() {
		DepositRequest depositRequest = DepositRequest
				.builder()
				.id(accountId)
				.balance(balance)
				.build();

		return new CrudRequester(
				RequestSpecs.authAsUser(username, password),
				Endpoint.DEPOSIT,
				ResponseSpecs.requestReturnsBadRequest())
				.post(depositRequest)
				.extract()
				.asString();
	}
}

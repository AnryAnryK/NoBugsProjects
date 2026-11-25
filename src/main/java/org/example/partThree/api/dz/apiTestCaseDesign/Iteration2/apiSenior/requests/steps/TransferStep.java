package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.TransferRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.TransferResponse;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.TransferRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.Endpoint;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.requesters.CrudRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.requesters.ValidatedCrudRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;

public class TransferStep {
	private long senderAccountId;
	private long receiverAccountId;
	private double amount;

	private String username1;
	private String password1;

	public TransferStep(String username1, String password1, long senderAccountId, long receiverAccountId, double amount) {
		this.username1=username1;
		this.password1=password1;
		this.senderAccountId = senderAccountId;
		this.receiverAccountId = receiverAccountId;
		this.amount = amount;
	}

	public TransferResponse makeTransfer(){
		TransferRequest transferRequest = TransferRequest.builder()
				.senderAccountId(senderAccountId)
				.receiverAccountId(receiverAccountId)
				.amount(amount)
				.build();

		return new ValidatedCrudRequester<TransferResponse>(
				RequestSpecs.authAsUser(username1, password1),
				Endpoint.TRANSFER,
				ResponseSpecs.requestReturnsOK())
				.post(transferRequest);
	}
	public String makeInvalidTransfer(){
		TransferRequest transferRequest = TransferRequest.builder()
				.senderAccountId(senderAccountId)
				.receiverAccountId(receiverAccountId)
				.amount(amount)
				.build();

		return new CrudRequester(
				RequestSpecs.authAsUser(username1, password1),
				Endpoint.TRANSFER,
				ResponseSpecs.requestReturnsBadRequest())
				.post(transferRequest)
				.extract()
				.asString();
	}
}


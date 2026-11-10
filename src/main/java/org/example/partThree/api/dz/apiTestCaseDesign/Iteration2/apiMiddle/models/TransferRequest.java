package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

public class TransferRequest extends BaseModel {
	private int senderAccountId;
	private int receiverAccountId;
	private double amount;

	public TransferRequest(int senderAccountId, int receiverAccountId, double amount) {
		this.senderAccountId = senderAccountId;
		this.receiverAccountId = receiverAccountId;
		this.amount = amount;
	}

	public int getSenderAccountId() {
		return senderAccountId;
	}

	public int getReceiverAccountId() {
		return receiverAccountId;
	}

	public double getAmount() {
		return amount;
	}
}

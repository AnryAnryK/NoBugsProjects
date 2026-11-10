package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

public class DepositRequest extends BaseModel {
	private int id;
	private double balance;

	public DepositRequest(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public DepositRequest(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import java.util.List;

public class DepositResponse extends BaseModel {
	private int id;
	private String accountNumber;
	private double balance;
	private List<String> transactions;
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepositResponse extends BaseModel {
	private int id;
	private String accountNumber;
	private double balance;
	private List<String> transactions;
}

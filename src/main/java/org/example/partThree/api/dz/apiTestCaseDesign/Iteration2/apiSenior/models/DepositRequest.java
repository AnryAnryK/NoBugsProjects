package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepositRequest extends BaseModel {
	private long id;
	private double balance;
}

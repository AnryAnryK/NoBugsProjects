package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerNameResponse extends BaseModel {
	private String message;
	private Customer customer;
	private int id;
	private String username;
	private String password;
	private String name;
	private String role;
	private List<String> accounts;


	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Customer {
		private int id;
		private String username;
		private String password;
		private String name;
		private String role;
		private List<String> accounts;
	}
}

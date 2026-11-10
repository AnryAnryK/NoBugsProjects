package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

public class CustomerNameRequest extends BaseModel {
	private String name;

	public CustomerNameRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

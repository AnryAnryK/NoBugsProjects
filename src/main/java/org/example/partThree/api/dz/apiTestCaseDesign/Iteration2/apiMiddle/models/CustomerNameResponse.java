package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

public class CustomerNameResponse extends BaseModel {
	private String newName;

	public CustomerNameResponse(String newName) {
		this.newName = newName;
	}

	public String getNewName() {
		return newName;
	}
}

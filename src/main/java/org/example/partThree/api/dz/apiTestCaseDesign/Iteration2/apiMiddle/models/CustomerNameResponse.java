package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

public class CustomerNameResponse extends BaseModel {
	private String newName;

	public CustomerNameResponse() {
	}

	public CustomerNameResponse(String newName) {
		this.newName = newName;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public static CustomerNameResponseBuilder builder() {
		return new CustomerNameResponseBuilder();
	}

	public static class CustomerNameResponseBuilder {
		private String newName;

		public CustomerNameResponseBuilder newName(String newName) {
			this.newName = newName;
			return this;
		}

		public CustomerNameResponse build() {
			return new CustomerNameResponse(newName);
		}
	}
}

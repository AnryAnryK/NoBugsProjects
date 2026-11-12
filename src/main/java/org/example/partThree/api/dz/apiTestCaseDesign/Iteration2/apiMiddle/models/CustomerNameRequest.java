package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import java.util.Objects;

public class CustomerNameRequest extends BaseModel {
	private String name;

	public CustomerNameRequest() {
	}

	public CustomerNameRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CustomerNameRequest that = (CustomerNameRequest) o;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}

	@Override
	public String toString() {
		return "CustomerNameRequest{" +
				"name='" + name + '\'' +
				'}';
	}

	public static CustomerNameRequestBuilder builder() {
		return new CustomerNameRequestBuilder();
	}

	public static class CustomerNameRequestBuilder {
		private String name;

		public CustomerNameRequestBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CustomerNameRequest build() {
			return new CustomerNameRequest(name);
		}
	}
}

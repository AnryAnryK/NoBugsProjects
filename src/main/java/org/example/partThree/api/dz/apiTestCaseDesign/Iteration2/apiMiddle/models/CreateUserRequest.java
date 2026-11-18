package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import java.util.Objects;

public class CreateUserRequest extends BaseModel {
	private String username;
	private String password;
	private String role;

	public CreateUserRequest() {
	}

	public CreateUserRequest(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CreateUserRequest that = (CreateUserRequest) o;
		return Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(role, that.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password, role);
	}

	@Override
	public String toString() {
		return "CreateUserRequest{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", role='" + role + '\'' +
				'}';
	}

	public static CreateUserRequestBuilder builder() {
		return new CreateUserRequestBuilder();
	}

	public static class CreateUserRequestBuilder {
		private String username;
		private String password;
		private String role;

		public CreateUserRequestBuilder username(String username) {
			this.username = username;
			return this;
		}

		public CreateUserRequestBuilder password(String password) {
			this.password = password;
			return this;
		}

		public CreateUserRequestBuilder role(String role) {
			this.role = role;
			return this;
		}

		public CreateUserRequest build() {
			return new CreateUserRequest(username, password, role);
		}
	}
}
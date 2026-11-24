package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import java.util.Objects;

public class LoginUserResponse {
	private String username;
	private String role;

	public LoginUserResponse() {
	}

	public LoginUserResponse(String username, String role) {
		this.username = username;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LoginUserResponse that = (LoginUserResponse) o;
		return Objects.equals(username, that.username) && Objects.equals(role, that.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, role);
	}

	@Override
	public String toString() {
		return "LoginUserResponse{" +
				"username='" + username + '\'' +
				", role='" + role + '\'' +
				'}';
	}

	public static LoginUserResponseBuilder builder() {
		return new LoginUserResponseBuilder();
	}

	public static class LoginUserResponseBuilder {
		private String username;
		private String role;

		public LoginUserResponseBuilder username(String username) {
			this.username = username;
			return this;
		}

		public LoginUserResponseBuilder role(String role) {
			this.role = role;
			return this;
		}

		public LoginUserResponse build() {
			return new LoginUserResponse(username, role);
		}
	}
}
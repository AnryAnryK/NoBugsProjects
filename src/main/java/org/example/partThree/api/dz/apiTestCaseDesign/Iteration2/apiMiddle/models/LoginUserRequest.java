package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import java.util.Objects;

public class LoginUserRequest extends BaseModel {
	private String username;
	private String password;

	public LoginUserRequest() {
	}

	public LoginUserRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LoginUserRequest that = (LoginUserRequest) o;
		return Objects.equals(username, that.username) && Objects.equals(password, that.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password);
	}

	@Override
	public String toString() {
		return "LoginUserRequest{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	public static LoginUserRequestBuilder builder() {
		return new LoginUserRequestBuilder();
	}

	public static class LoginUserRequestBuilder {
		private String username;
		private String password;

		public LoginUserRequestBuilder username(String username) {
			this.username = username;
			return this;
		}

		public LoginUserRequestBuilder password(String password) {
			this.password = password;
			return this;
		}

		public LoginUserRequest build() {
			return new LoginUserRequest(username, password);
		}
	}
}

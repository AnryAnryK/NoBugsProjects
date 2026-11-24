package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.models;

import java.util.List;
import java.util.Objects;

public class CreateUserResponse extends BaseModel {
	private long id;
	private String username;
	private String password;
	private String name;
	private String role;
	private List<String> accounts;

	public CreateUserResponse() {
	}

	public CreateUserResponse(long id, String username, String password, String name, String role, List<String> accounts) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.accounts = accounts;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CreateUserResponse that = (CreateUserResponse) o;
		return id == that.id && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(role, that.role) && Objects.equals(accounts, that.accounts);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, password, name, role, accounts);
	}

	@Override
	public String toString() {
		return "CreateUserResponse{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", role='" + role + '\'' +
				", accounts=" + accounts +
				'}';
	}

	public static CreateUserResponseBuilder builder() {
		return new CreateUserResponseBuilder();
	}

	public static class CreateUserResponseBuilder {
		private long id;
		private String username;
		private String password;
		private String name;
		private String role;
		private List<String> accounts;


		public CreateUserResponseBuilder id(long id) {
			this.id = id;
			return this;
		}

		public CreateUserResponseBuilder username(String username) {
			this.username = username;
			return this;
		}

		public CreateUserResponseBuilder password(String password) {
			this.password = password;
			return this;
		}

		public CreateUserResponseBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CreateUserResponseBuilder role(String role) {
			this.role = role;
			return this;
		}

		public CreateUserResponseBuilder accounts(List<String> accounts) {
			this.accounts = accounts;
			return this;
		}

		public CreateUserResponse build() {
			return new CreateUserResponse(id, username, password, name, role, accounts);
		}
	}
}

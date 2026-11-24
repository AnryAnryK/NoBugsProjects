package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.steps;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.CreateUserRequest;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.Roles;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer.RandomData;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.AdminCreateUserRequester;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.RequestSpecs;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.specs.ResponseSpecs;

public class CreateUserByAdminStep {
	public final String username;
	public final String password;

	public CreateUserByAdminStep() {
		this.username = RandomData.getUsername();
		this.password = RandomData.getPassword();
	}

	public void createUserByAdmin() {
		// создание пользователя
		CreateUserRequest createUserRequest = CreateUserRequest
				.builder()
				.username(username)
				.password(password)
				.role(Roles.USER.toString())
				.build();

		new AdminCreateUserRequester(
				RequestSpecs.adminSpec(),
				ResponseSpecs.entityWasCreated())
				.post(createUserRequest);
	}
}

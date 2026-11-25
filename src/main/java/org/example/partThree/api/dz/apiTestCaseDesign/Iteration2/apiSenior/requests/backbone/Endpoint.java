package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.*;

@Getter
@AllArgsConstructor
public enum Endpoint {

	ADMIN_USER(
			"/admin/users",
			CreateUserRequest.class,
			CreateUserResponse.class
	),

	LOGIN(
			"/auth/login",
			LoginUserRequest.class,
			LoginUserResponse.class
	),

	ACCOUNTS(
			"/accounts",
			BaseModel.class,
			CreateAccountResponse.class
	),

	DEPOSIT(
			"/accounts/deposit",
			DepositRequest.class,
			DepositResponse.class
	),

	TRANSFER(
			"/accounts/transfer",
			TransferRequest.class,
			TransferResponse.class
	),

	CUSTOMER(
			"/customer/profile",
			CustomerNameRequest.class,
			CustomerNameResponse.class
	),

	CUSTOMER_ACCOUNTS(
			"/customer/accounts",
			CustomerNameRequest.class,
			CustomerNameResponse.class
	);

	private final String url;
	private final Class<? extends BaseModel> requestModel;
	private final Class<? extends BaseModel> responseModel;
}

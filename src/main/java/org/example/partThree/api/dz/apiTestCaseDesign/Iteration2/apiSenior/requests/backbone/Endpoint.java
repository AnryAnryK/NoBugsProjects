package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.*;

public enum Endpoint {

//	ADMIN_USER(
//			"/admin/users",
//			CreateUserRequest.class,
//			CreateUserResponse.class
//	),
//
//	LOGIN(
//			"/auth/login",
//			LoginUserRequest.class,
//			LoginUserResponse.class
//	),
//
//	ACCOUNTS(
//			"/accounts",
//			BaseModel.class,
//			CreateAccountResponse.class
//	),

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
	);

	private final String url;
	private final Class<? extends BaseModel> requestModel;
	private final Class<? extends BaseModel> responseModel;

	Endpoint(String url, Class<? extends BaseModel> requestModel, Class<? extends BaseModel> responseModel) {
		this.url = url;
		this.requestModel = requestModel;
		this.responseModel = responseModel;
	}

	public String getUrl() {
		return url;
	}

	public Class<? extends BaseModel> getRequestModel() {
		return requestModel;
	}

	public Class<? extends BaseModel> getResponseModel() {
		return responseModel;
	}
}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.messages;

public class AlertMessages {
	private AlertMessages() {

	}

	public enum Profile {
		PROFILE_UPDATED_SUCCESSFULLY("Profile updated successfully"),
		ERROR_NAME_NOT_TWO_WORDS_WITH_LETTERS("Name must contain two words with letters only"),
		UNAUTHORISED_ACCESS_TO_ACCOUNT("Unauthorized access to account");

		private final String message;

		Profile(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

	public enum Deposit {
		DEPOSIT_AMOUNT_MUST_BE_AT_LEAST_001("Deposit amount must be at least 0.01"),
		DEPOSIT_AMOUNT_CANNOT_EXCEED_5000("Deposit amount cannot exceed 5000");

		private final String message;

		Deposit(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

	public enum Transfer {
		TRANSFER_SUCCESSFUL("Transfer successful"),
		INVALID_TRANSFER_INSUFFICIENT_FUNDS_OR_INVALID_ACCOUNTS("Invalid transfer: insufficient funds or invalid accounts"),
		TRANSFER_AMOUNT_CANNOT_EXCEED_10000("Transfer amount cannot exceed 10000");


		private final String message;

		Transfer(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}
}

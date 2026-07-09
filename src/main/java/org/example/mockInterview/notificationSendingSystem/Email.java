package org.example.mockInterview.notificationSendingSystem;

public class Email extends Notification{
	public Email(String recipient, String textMessage) {
		super(recipient, textMessage);
	}

	@Override
	public String getType() {
		return "Email";
	}
}

package org.example.mockInterview.notificationSendingSystem;

public class Sms extends Notification {
	public Sms(String recipient, String textMessage) {
		super(recipient, textMessage);
	}

	@Override
	public String getType() {
		return "SMS";
	}
}

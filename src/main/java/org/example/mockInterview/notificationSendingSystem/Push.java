package org.example.mockInterview.notificationSendingSystem;

public class Push extends Notification {

	public Push(String recipient, String textMessage){
		super(recipient, textMessage);
	}

	@Override
	public String getType() {
		return "Push";
	}
}

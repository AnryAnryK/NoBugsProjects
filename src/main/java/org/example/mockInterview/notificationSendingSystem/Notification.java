package org.example.mockInterview.notificationSendingSystem;

public abstract class Notification {
	private final String recipient;
	private final String textMessage;


	public Notification(String recipient, String textMessage) {
		this.recipient = recipient;
		this.textMessage = textMessage;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public String sendMessage(){
	 return getType() + " отправлен на " + recipient + ": " + textMessage;
	}

	public abstract String getType();
}

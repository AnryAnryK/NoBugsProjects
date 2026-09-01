package org.example.answerBook.oopPrinciplesInJava.task7;

public class User {
	private String userName;
	private Notifier notifier;

	public User(String userName, Notifier notifier) {
		this.userName = userName;
		this.notifier = notifier;
	}

	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}

	public String getNotifier() {
		return notifier.getClass().getSimpleName();
	}

	public void sendMessage(String message) {
		notifier.notify(this, message);
	}

	public String getUserName() {
		return userName;
	}
}

package org.example.answerBook.oopPrinciplesInJava.task12;

public class User {
	private String userName;
	private Subscription subscription;

	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public boolean canAccess(String featureName){
		return subscription.canAccess(featureName);
	}
}

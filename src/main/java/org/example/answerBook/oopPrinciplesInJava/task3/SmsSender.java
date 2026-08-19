package org.example.answerBook.oopPrinciplesInJava.task3;

public class SmsSender implements NotificationSender {
	@Override
	public void send(String message) {
		System.out.println("Пришло смс-сообщение: " + message);
	}
}

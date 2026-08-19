package org.example.answerBook.oopPrinciplesInJava.task3;

public class PushSender implements NotificationSender {
	@Override
	public void send(String message) {
		System.out.println("Пришло push-сообщение: " + message);
	}
}

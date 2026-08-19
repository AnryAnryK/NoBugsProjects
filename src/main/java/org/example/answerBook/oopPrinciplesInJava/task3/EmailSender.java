package org.example.answerBook.oopPrinciplesInJava.task3;

public class EmailSender implements NotificationSender {
	@Override
	public void send(String message) {
		System.out.println("Пришло email-сообщение: " + message);
	}
}

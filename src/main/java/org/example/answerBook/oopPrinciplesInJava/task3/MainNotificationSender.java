package org.example.answerBook.oopPrinciplesInJava.task3;

import java.util.Arrays;
import java.util.List;

public class MainNotificationSender {

	public static void notifyUsers(List<NotificationSender> senders, String msg) {
		if (senders == null || senders.isEmpty()) {
			System.out.println("Заполните данные Получателями");
			return;
		}
		for (NotificationSender ns : senders) {
			ns.send(msg);
		}
	}

	public static void main(String[] args) {
		List<NotificationSender> notifications = Arrays.asList(
				new EmailSender(),
				new SmsSender(),
				new PushSender()
		);
		notifyUsers(notifications, "Система обновлена");
	}
}

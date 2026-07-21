package org.example.mockInterview.notificationSendingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationManager {

	public List<Notification> notification;

	public NotificationManager(List<Notification> notification) {
		this.notification = notification;
	}

	public void sendAllMessage() {
		for (var notes : notification) {
			System.out.println(notes.sendMessage());
		}
	}


	public static void main(String[] args) {

		// Вариант 1
		Email email1 = new Email("alex@test.com", "Ваш заказ готов");
		Sms sms1 = new Sms("123456789", "Код подтверждения 1234");
		Push push1 = new Push("device-777", "У вас новое сообщение");

		List<Notification> allNotifications = new ArrayList<>();
		allNotifications.add(email1);
		allNotifications.add(sms1);
		allNotifications.add(push1);


		// Вариант 2
//		List<Notification> allNotifications = Arrays.asList(
//				new Email("alex@test.com", "Ваш заказ готов"),
//				new Sms("123456789", "Код подтверждения 1234"),
//				new Push("device-777", "У вас новое сообщение")
//		);

		NotificationManager notificationManager1 = new NotificationManager(allNotifications);
		notificationManager1.sendAllMessage();
	}
}

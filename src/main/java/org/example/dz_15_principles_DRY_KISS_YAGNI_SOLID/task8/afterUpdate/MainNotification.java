package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task8.afterUpdate;

public class MainNotification {
	public static void main(String[] args) {
		Notification notificationEmail = new EmailNotification();

		NotificationService notificationService = new NotificationService(notificationEmail);
		notificationService.sendNotification(" Сообщение на milk@yandex.com");
	}
}

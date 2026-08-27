package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task8.afterUpdate;

public class EmailNotification extends Notification {
	@Override
	public void sendNotification(String message) {
		System.out.println("Отправка email-сообщения: " + message);
	}
}

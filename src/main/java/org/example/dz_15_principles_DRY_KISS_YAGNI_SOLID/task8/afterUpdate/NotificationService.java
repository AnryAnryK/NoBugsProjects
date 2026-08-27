package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task8.afterUpdate;

/*
8. Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов.
Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
 */

public class NotificationService {
	private Notification notification;

	public NotificationService(Notification notification) {
		this.notification = notification;
	}

	public void sendNotification(String message) {
		notification.sendNotification(message);
	}
}




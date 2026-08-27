package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task8.beforeUpdate;

/*
8. Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов.
Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
 */

public class NotificationService {
	private EmailSender emailSender = new EmailSender();
	public void sendNotification(String message) {
		emailSender.sendEmail(message);
	}
}
class EmailSender {
	public void sendEmail(String message) {
		System.out.println("Отправка email: " + message);
	}
}
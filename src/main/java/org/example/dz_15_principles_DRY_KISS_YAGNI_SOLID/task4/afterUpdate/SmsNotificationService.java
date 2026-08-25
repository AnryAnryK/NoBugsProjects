package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.afterUpdate;

public class SmsNotificationService implements NotificationService {
	@Override
	public void sendNotification(Order order){
		System.out.println("Отправляем клиенту SMS по Заказу: " + order.getOrderNumber());
	}
}

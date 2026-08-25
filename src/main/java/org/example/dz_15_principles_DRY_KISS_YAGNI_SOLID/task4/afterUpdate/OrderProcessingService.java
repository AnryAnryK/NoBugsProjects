package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.afterUpdate;

public class OrderProcessingService {

	public void processOrder(Order order) {
		System.out.println("Обрабатываем заказ: " + order.getOrderNumber());
	}
}
package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.afterUpdate;

public class MainOrder {
	public static void main(String[] args) {
		OrderProcessingService orderProcessingService1 = new OrderProcessingService();

		NotificationService notificationService1 = new EmailNotificationService();
		NotificationService notificationService2 = new SmsNotificationService();

		InvoiceGenerationService invoiceGenerationService1 = new InvoiceGenerationService();

		Manager manager1 = new Manager(orderProcessingService1, notificationService1, invoiceGenerationService1);
		Order order1 = new Order(1, "Брюки");
		manager1.complete(order1);

		Manager manager2 = new Manager(orderProcessingService1, notificationService2, invoiceGenerationService1);
		Order order2 = new Order(2, "Куртка");
		manager2.complete(order2);
	}
}

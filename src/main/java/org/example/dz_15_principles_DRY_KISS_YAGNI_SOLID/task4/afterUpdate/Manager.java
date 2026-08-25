package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.afterUpdate;

public class Manager {
	private final OrderProcessingService orderProcessingService;
	private final NotificationService notificationService;
	private final InvoiceGenerationService invoiceGenerator;

	public Manager(OrderProcessingService orderProcessingService, NotificationService notificationService, InvoiceGenerationService invoiceGenerationService) {
		this.orderProcessingService = orderProcessingService;
		this.notificationService = notificationService;
		this.invoiceGenerator = invoiceGenerationService;
	}

	public void complete(Order order){
		orderProcessingService.processOrder(order);
		notificationService.sendNotification(order);
		invoiceGenerator.generateInvoice(order);
		System.out.println("=====================");
	}
}

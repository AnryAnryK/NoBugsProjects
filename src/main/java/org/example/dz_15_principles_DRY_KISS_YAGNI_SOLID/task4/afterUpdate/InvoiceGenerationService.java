package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.afterUpdate;

public class InvoiceGenerationService implements InvoiceGenerator {

	@Override
	public void generateInvoice(Order order){
		System.out.println("Генерируем счет по Заказу номер: " + order.getOrderNumber() + ", Наименование Заказа: " + order.getTitle());
	}
}

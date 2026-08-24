package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task2.afterUpdate;

public class MainCalculateDiscount {
	public static void main(String[] args) {
		Product product1 = new Product(100.00, "Сок");
		Customer customer1 = new Customer("Вася", false);
		DiscountCalculator discountCalculator1 = new DiscountCalculator();
		System.out.println("Заказ Клиента: " + customer1.getName() + ": " + discountCalculator1.calculateDiscount(product1, customer1, false, false));

		Product product2 = new Product(100.00, "Молоко");
		Customer customer2 = new Customer("Петя", true);
		DiscountCalculator discountCalculator2 = new DiscountCalculator();
		System.out.println("Заказ Клиента: " + customer2.getName() + ": " + discountCalculator2.calculateDiscount(product2, customer2, false, false));

		Product product3 = new Product(100.00, "Кофе");
		Customer customer3 = new Customer("Петя", true);
		DiscountCalculator discountCalculator3 = new DiscountCalculator();
		System.out.println("Заказ Клиента: " + customer3.getName() + ": " + discountCalculator3.calculateDiscount(product3, customer3, true, false));

		Product product4 = new Product(100.00, "Помидор");
		Customer customer4 = new Customer("Сёма", true);
		DiscountCalculator discountCalculator4 = new DiscountCalculator();
		System.out.println("Заказ Клиента: " + customer4.getName() + ": " + discountCalculator4.calculateDiscount(product4, customer4, true, true));
	}
}

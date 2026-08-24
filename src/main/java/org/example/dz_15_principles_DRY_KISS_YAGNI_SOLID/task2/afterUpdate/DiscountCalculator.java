package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task2.afterUpdate;

/*
2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код
Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
 */

public class DiscountCalculator {
	public static final double DISCOUNT = 0.02;
	public static final double DISCOUNT_LOYAL_CUSTOMER = 0.05;
	public static final double DISCOUNT_FIRST_PURCHASE = 0.05;
	public static final double DISCOUNT_WITH_COUPON = 0.07;

	public double calculateDiscount(Product product, Customer customer, boolean isFirstPurchase, boolean hasCoupon) {
		double price = product.getPrice();


		if (customer.isLoyalCustomer() && isFirstPurchase) {
			return price - price * (DISCOUNT_LOYAL_CUSTOMER + DISCOUNT_FIRST_PURCHASE);
		} else if (customer.isLoyalCustomer()) {
			return price - price * DISCOUNT_LOYAL_CUSTOMER;
		} else if (hasCoupon) {
			return price - price * DISCOUNT_WITH_COUPON;
		} else if (!customer.isLoyalCustomer() && !isFirstPurchase && !hasCoupon) {
			return price - price * DISCOUNT;
		}
		return price;
	}
}


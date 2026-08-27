package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task5.beforeUpdate;

/*
5. Нарушение OCP (Open/Closed Principle) – закрытый для расширения код.
Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).
 */

public class PaymentProcessor {
	public void processPayment(String paymentType, double amount) {
		if (paymentType.equals("CreditCard")) {
			System.out.println("Оплата кредитной картой на сумму " + amount);
		} else if (paymentType.equals("PayPal")) {
			System.out.println("Оплата через PayPal на сумму " + amount);
		} else if (paymentType.equals("Bitcoin")) {
			System.out.println("Оплата Bitcoin на сумму " + amount);
		}
	}
}

package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task5.afterUpdate;

/*
5. Нарушение OCP (Open/Closed Principle) – закрытый для расширения код.
Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).
 */

public class PaymentProcessor {
	private PaymentService paymentService;

	public PaymentProcessor(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processPayment(double amount) {
		paymentService.process(amount);
	}
}

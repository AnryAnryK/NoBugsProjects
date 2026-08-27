package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task5.afterUpdate;

public class PayPalService extends PaymentService {

	@Override
	public void process(double amount) {
		System.out.println("Оплата через PayPal на сумму " + amount);
	}
}

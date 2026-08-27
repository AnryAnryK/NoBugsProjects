package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task5.afterUpdate;

public class MainPaymentProcessor {
	public static void main(String[] args) {
		CreditCardService creditCardService = new CreditCardService();
		PaymentProcessor paymentProcessorCreditCard = new PaymentProcessor(creditCardService);
		paymentProcessorCreditCard.processPayment(100.2);

		PayPalService payPalService = new PayPalService();
		PaymentProcessor paymentProcessorPayPal = new PaymentProcessor(payPalService);
		paymentProcessorPayPal.processPayment(200.2);

		BitcoinService bitcoinService = new BitcoinService();
		PaymentProcessor paymentProcessorBitcoin = new PaymentProcessor(bitcoinService);
		paymentProcessorBitcoin.processPayment(300.3);
	}
}

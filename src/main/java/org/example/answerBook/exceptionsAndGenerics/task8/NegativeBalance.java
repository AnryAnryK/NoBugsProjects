package org.example.answerBook.exceptionsAndGenerics.task8;

/*
8. Отрицательный баланс
 Собственное исключение при превышении остатка на счёте.
 */

public class NegativeBalance {
	private static double balance;

	public static double getBalance() {
		return balance;
	}

	public static double addBalance(double sum) {
		try {
			if (sum <= 0) {
				throw new NegativeBalanceException("Сумма пополнения не может быть <= 0");
			}
			balance = balance + sum;
		} catch (RuntimeException e) {
			throw e;
		}
		return balance;
	}

	public static double withdrawBalance(double withdraw) {
		if (withdraw <= 0) {
			throw new NegativeBalanceException("Сумма снятия не может быть <= 0");
		}
		if (balance < withdraw) {
			throw new NegativeBalanceException("Сумма снятия не может быть больше суммы на балансе");
		}
		System.out.println("С баланса снято: " + withdraw);
		return balance -= withdraw;
	}
}

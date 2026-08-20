package org.example.answerBook.staticFinalAccessModifiers.task5;

/*
5. Защищённый банковский счёт
 Разработай класс BankAccount, который хранит значение баланса.
Должны быть методы deposit() и withdraw(), а также метод для получения текущего баланса.
Баланс должен быть недоступен извне для прямого изменения.
Пояснение: класс должен обеспечивать безопасность изменения данных только через свои методы.
 */

public class BankAccount {
	private double balance;

	public BankAccount() {
		this.balance = 0;
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double sum) {
		if (sum <= 0) {
			throw new IllegalArgumentException("Сумма внесения на счёт не может быть <= 0");
		} else {
			balance = balance + sum;
			System.out.println("На счёт внесено: " + sum);
		}
	}

	public void withdraw(double sum) {
		if (sum <= 0) {
			throw new IllegalArgumentException("Сумма снятия со счёта не может быть <= 0");
		}
		if (balance >= sum) {
			balance = balance - sum;
			System.out.println("Со счёта списано: " + sum);
		} else {
			System.out.println("Недостаточно денег на счёте для снятия суммы: " + sum);
		}
	}
}

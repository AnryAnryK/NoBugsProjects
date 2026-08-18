package org.example.answerBook.oopPrinciplesInJava.task1;

/*
1. Банковский счёт (Инкапсуляция)
 Создай класс BankAccount, который содержит поле balance. Баланс нельзя устанавливать напрямую.
Реализуй методы deposit(double amount) и withdraw(double amount), которые изменяют баланс только при корректных значениях.
Также реализуй метод getBalance(), возвращающий текущее значение.
Пояснение: нужно ограничить доступ к внутреннему состоянию и управлять им строго через методы.
 */

public class BankAccount {
	private double balance;

	public BankAccount() {
		this.balance = 0;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Значение amount не может быть <= 0.");
			return;
		}
		balance = balance + amount;
		System.out.println("На счёт положили: " + amount + ".");
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Значение amount не может быть <= 0");
			return;
		}
		if (amount > balance) {
			System.out.println("Недостаточно денег на счёте");
			return;
		}
		balance = balance - amount;
		System.out.println("Со счёта сняли: " + amount + ".");
	}
}

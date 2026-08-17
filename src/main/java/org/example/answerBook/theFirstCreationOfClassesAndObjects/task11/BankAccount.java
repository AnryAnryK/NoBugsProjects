package org.example.answerBook.theFirstCreationOfClassesAndObjects.task11;

/*
11. Класс BankAccount
 Создай класс BankAccount, описывающий банковский счёт.
Поле: balance (тип double).
Добавь методы:

deposit(double amount) — увеличивает баланс;
withdraw(double amount) — уменьшает, если хватает средств;
printBalance() — выводит текущий баланс.
Подсказка: в withdraw добавь проверку, что amount <= balance.
 */

public class BankAccount {
	private double balance;

	BankAccount(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Начальный баланс не может быть < 0");
		}
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Сумма пополнения не может быть <= 0");
		}
		this.balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Сумма снятия не может быть <= 0");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Недостаточно средств на счёте");
		}
		this.balance = balance - amount;
	}

	public void printBalance() {
		System.out.println("Текущий баланс: " + balance);
	}
}

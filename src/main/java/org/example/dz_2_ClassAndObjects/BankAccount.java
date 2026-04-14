package org.example.dz_2_ClassAndObjects;

public class BankAccount {

	/*
	Класс BankAccount
Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор, геттеры, сеттер для владельца,
методы deposit(amount) и withdraw(amount) и метод printBalance().
В main внесите деньги, снимите и выведите баланс.
	 */

	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount("Петя", 100);
		System.out.println("Всего денег на балансе : ");
		bankAccount1.printBalance();

		bankAccount1.deposit(5);
		System.out.println("Добавили 5 к деньгам на балансе и денег стало : ");
		bankAccount1.printBalance();

		bankAccount1.withdraw(10);
		System.out.println("Отняли 10 денег от того, что было на балансе, и денег стало : ");
		bankAccount1.printBalance();
	}


	private String owner;
	private double balance;


	public BankAccount(String newOwner, double newBalance) {
		this.owner = newOwner;
		this.balance = newBalance;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void printBalance() {
		System.out.println("Баланс владельца " + " " + this.owner + " равен : " + this.balance);
	}
}

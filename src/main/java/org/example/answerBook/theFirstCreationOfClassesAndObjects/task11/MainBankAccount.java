package org.example.answerBook.theFirstCreationOfClassesAndObjects.task11;

public class MainBankAccount {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(100);
		acc1.deposit(25);
		acc1.withdraw(12);
		acc1.printBalance();
	}
}

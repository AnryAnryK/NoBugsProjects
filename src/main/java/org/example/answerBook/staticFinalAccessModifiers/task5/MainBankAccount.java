package org.example.answerBook.staticFinalAccessModifiers.task5;

public class MainBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount();
		System.out.println("На счету: " + bankAccount1.getBalance());

		bankAccount1.deposit(50);
		System.out.println("На счету: " + bankAccount1.getBalance());

		bankAccount1.withdraw(12);
		System.out.println("На счету: " + bankAccount1.getBalance());

		bankAccount1.withdraw(40);
		System.out.println("На счету: " + bankAccount1.getBalance());
	}
}

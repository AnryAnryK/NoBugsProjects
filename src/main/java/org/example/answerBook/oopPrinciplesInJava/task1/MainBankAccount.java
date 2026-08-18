package org.example.answerBook.oopPrinciplesInJava.task1;

public class MainBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.deposit(100);
		bankAccount1.withdraw(20);
		System.out.println(bankAccount1.getBalance());

		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.deposit(- 100);
		bankAccount2.withdraw(- 20);
		System.out.println(bankAccount2.getBalance());
	}
}

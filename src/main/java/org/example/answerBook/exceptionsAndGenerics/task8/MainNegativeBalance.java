package org.example.answerBook.exceptionsAndGenerics.task8;

public class MainNegativeBalance {
	public static void main(String[] args) {
		System.out.println("На балансе: " + NegativeBalance.getBalance());
		System.out.println("На баланс добавлено: " + NegativeBalance.addBalance(110));
		System.out.println("На балансе: " + NegativeBalance.getBalance());
		System.out.println("Баланс после снятия: " + NegativeBalance.withdrawBalance(100));
		System.out.println("С баланса снято: " + NegativeBalance.withdrawBalance(-20));
		System.out.println("С баланса снято: " + NegativeBalance.withdrawBalance(20));
	}
}

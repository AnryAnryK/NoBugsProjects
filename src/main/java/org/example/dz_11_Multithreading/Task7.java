package org.example.dz_11_Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Task7 {
	/*
	7. Реализация блокировки с использованием ReentrantLock
Условие задачи:
Напишите программу, которая моделирует работу банковского счета с несколькими потоками. Каждый поток должен попытаться перевести деньги с одного счета на другой.
Для обеспечения правильной работы программы используйте ReentrantLock для синхронизации работы с двумя счетами.
	 */

	/*
	СЛОЖНО ДЛЯ МЕНЯ, ЗАДАЧУ НЕ СДЕЛАЛ (попытки кода - ниже).
	 */




//	ReentrantLock reentrantLock = new ReentrantLock();

//	int addSum = 0;
//	int minusSum = 0;
//
//
//	public void addSum(int value) {
//		addSum = addSum + value;
//	}
//
//	public void minusSum(int value) {
//		minusSum = minusSum + value;
//	}
//
//	public int countSum() {
//		return addSum - minusSum;
//	}


	public static void main(String[] args) {
		Task7 task7 = new Task7();
//		task7.addSum(150);
//		task7.minusSum(100);
//		System.out.println(task7.countSum());

//		Runnable threadAddSum = () -> {
//			task7.addSum(12);
//		};
//
//		Runnable threadMinusSum = () -> {
//			task7.minusSum(11);
//		};
//
//		threadAddSum.run();
//		task7.reentrantLock.lock();
//		System.out.println(threadAddSum);
//
//		threadMinusSum.run();
//		task7.reentrantLock.unlock();
//		System.out.println(threadMinusSum);

	}
}

class Account {
	private int balance = 0;
	ReentrantLock reentrantLock = new ReentrantLock();

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void increment() {
		for (int i = 0; i < 9; i++) {
			balance = balance + 1;
		}
	}

	public void decrement() {
		for (int i = 0; i < 9; i++) {
			balance = balance - 1;
		}
	}

	public void score(){
		reentrantLock.lock();
		try {
			increment();
			System.out.println("Добавляем деньги на счёт");
		} finally {
			reentrantLock.unlock();
		}
	}
}

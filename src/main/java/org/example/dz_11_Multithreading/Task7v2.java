package org.example.dz_11_Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Task7v2 {
	/*
	7. Реализация блокировки с использованием ReentrantLock
Условие задачи:
Напишите программу, которая моделирует работу банковского счета с несколькими потоками. Каждый поток должен попытаться перевести деньги с одного счета на другой.
Для обеспечения правильной работы программы используйте ReentrantLock для синхронизации работы с двумя счетами.
	 */

	/*
	СЛОЖНО ДЛЯ МЕНЯ, ЗАДАЧУ, как мне кажется, я НЕ СДЕЛАЛ (попытки кода - ниже).
	 */


	public static void main(String[] args) {
		Accountv2 accountv2 = new Accountv2(150);
		accountv2.score();
	}
}

class Accountv2 {
	private int balance = 0;
	ReentrantLock reentrantLock = new ReentrantLock();

	public Accountv2(int balance) {
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

	public void score() {
		increment();
		reentrantLock.lock();
		try {
			System.out.println("Добавляем деньги на счёт в размере: " + balance);
		} finally {
			reentrantLock.unlock();
		}
	}
}

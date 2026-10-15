package org.example.answerBook.multithreading.task11;

/*
11. Синхронизированный блок vs метод
 Создай два метода: synchronized void increment() и void incrementWithBlock(), в котором используется synchronized(this).
 Проверь, что оба варианта работают одинаково
 */

public class SynchronizedBlockVsMethod {
	private int num = 0;

	public int getNum() {
		return num;
	}

	public synchronized void increment() {
		System.out.println("Поток: " + Thread.currentThread().getName() + ", increment: " + ++num);
	}

	public void incrementWithBlock() {
		synchronized (this) {
			System.out.println("Поток: " + Thread.currentThread().getName() + ", increment: " + ++num);
		}
	}
}

package org.example.dz_11_Multithreading;

public class Task2 {
	/*
	2. Задача: создание двух потоков
Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
	 */

	public synchronized static void main(String[] args) {
		Runnable threadA = () -> {
			for (int i = 0; i < 5; i++)

				try {
					System.out.println("A");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
		};

		Runnable threadB = () -> {
			for (int i = 0; i < 5; i++)

				try {
					System.out.println("B");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
		};

		Thread thread1 = new Thread(threadA);
		thread1.start();

		Thread thread2 = new Thread(threadB);
		thread2.start();

	}
}

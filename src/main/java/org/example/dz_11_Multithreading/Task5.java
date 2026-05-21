package org.example.dz_11_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task5 {
	/*
	5. Реализация пула потоков для обработки задач
Условие задачи:
Напишите программу, которая использует ExecutorService для создания пула потоков, в котором несколько потоков обрабатывают задачи.
Каждая задача — это выполнение простого теста с задержкой. Программа должна создать пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды.
После выполнения всех задач, результат должен быть выведен в главном потоке.
	 */

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es1 = Executors.newFixedThreadPool(4);

		Runnable thread1 = () -> {
			System.out.println(Thread.currentThread().getName() + ": Поток 1");
					try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		Runnable thread2 = () -> {
			System.out.println(Thread.currentThread().getName() + ": Поток 2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		Runnable thread3 = () -> {
			System.out.println(Thread.currentThread().getName() + ": Поток 3");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		Runnable thread4 = () -> {
			System.out.println(Thread.currentThread().getName() + ": Поток 4");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};
		Thread threadFirst = new Thread(thread1);
		threadFirst.start();

		Thread threadSecond = new Thread(thread2);
		threadSecond.start();

		Thread threadThird = new Thread(thread3);
		threadThird.start();

		Thread threadFourth = new Thread(thread4);
		threadFourth.start();

		threadFirst.join();
		threadSecond.join();
		threadThird.join();
		threadFourth.join();

		System.out.println(Thread.currentThread().getName() + " : Первый поток : " + threadFirst);
		System.out.println(Thread.currentThread().getName() + " : Второй поток : " + threadSecond);
		System.out.println(Thread.currentThread().getName() + " : Третий поток : " + threadThird);
		System.out.println(Thread.currentThread().getName() + " : Четвертый поток : " + threadFourth);

	}
}

package org.example.dz_11_Multithreading;

public class Task4 {
	/*
	4. Задача: использование synchronized
Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
Создайте два потока, каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.
	 */
}


class Counter {
	int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount(){
		return count;
	}

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		Runnable thread1 = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};

		Runnable thread2 = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};

		Thread threadFirst = new Thread(thread1);
		threadFirst.start();

		Thread threadSecond = new Thread(thread2);
		threadSecond.start();

		threadFirst.join();
		threadSecond.join();

		System.out.println("Общий счётчик потоков (должно быть равно 2000) = " + counter.getCount());
	}
}

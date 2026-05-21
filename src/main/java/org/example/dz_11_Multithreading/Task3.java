package org.example.dz_11_Multithreading;

public class Task3 {
	/*
	3. Задача: использование volatile
Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
	 */

	static volatile boolean stop = false;

	public static void main(String[] args) throws InterruptedException {

		Runnable thread1 = () -> {
			long count = 0;
			while (!stop) {
				count++;
			}
			System.out.println("Число: " + count);
		};

		Thread threadFirst = new Thread(thread1);
		threadFirst.start();
		Thread.sleep(2000);
		stop = true;
		threadFirst.join();
		System.out.println("Поток завершён !");
	}
}

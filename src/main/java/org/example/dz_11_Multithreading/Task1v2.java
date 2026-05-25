package org.example.dz_11_Multithreading;

public class Task1v2 {
	/*
	1. Задача: создание одного потока
Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
	 */

	/*
	Мой Вариант 02 решения (работает !   - этот вариант с лямбдой лучше, чем создание отдельных потоков)
	 */

	public static void main(String[] args) {

		Runnable task1 = () -> {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println("Привет из потока!");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		Thread thread1 = new Thread(task1);
		thread1.start();
	}
}

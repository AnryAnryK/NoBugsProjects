package org.example.dz_11_Multithreading;

public class Task1 implements Runnable {
	/*
	1. Задача: создание одного потока
Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
	 */

	/*
	Мой Вариант 01 решения (работает )
	 */

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Task1());
		thread1.start();
	}


	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Привет из потока!");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

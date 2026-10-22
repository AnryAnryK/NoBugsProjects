package org.example.answerBook.multithreading.task12;

/*
12. Обмен значениями между потоками
 Реализуй два потока, использующих общий объект с двумя полями. Один поток записывает, второй ждёт появления значения и выводит его. Используй wait/notify.
 */

public class ExchangeValuesBetweenThreads {
	public static void main(String[] args) throws InterruptedException {

		Product product = new Product();

		Runnable writer = () -> {
			try {
				product.write("Книга", 15.5);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		Runnable reader = () -> {
			try {
				product.waitAndPrint();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};
		Thread thread1 = new Thread(writer);
		Thread thread2 = new Thread(reader);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
	}
}

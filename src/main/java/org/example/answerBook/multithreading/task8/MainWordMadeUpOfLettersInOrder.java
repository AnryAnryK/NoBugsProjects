package org.example.answerBook.multithreading.task8;

public class MainWordMadeUpOfLettersInOrder {


	public static void main(String[] args) throws InterruptedException {
		WordMadeUpOfLettersInOrder wordMadeUpOfLettersInOrder = new WordMadeUpOfLettersInOrder();

		Runnable taskC = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					wordMadeUpOfLettersInOrder.printC();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		Runnable taskA = () -> {

			for (int i = 0; i < 10; i++) {
				try {
					wordMadeUpOfLettersInOrder.printA();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		Runnable taskT = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					wordMadeUpOfLettersInOrder.printT();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};

		Thread thread1 = new Thread(taskC);
		Thread thread2 = new Thread(taskA);
		Thread thread3 = new Thread(taskT);

		thread1.start();
		thread2.start();
		thread3.start();

		thread1.join();
		thread2.join();
		thread3.join();
	}
}

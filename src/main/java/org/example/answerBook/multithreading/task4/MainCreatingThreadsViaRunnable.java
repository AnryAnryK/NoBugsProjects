package org.example.answerBook.multithreading.task4;

public class MainCreatingThreadsViaRunnable {
	public static void main(String[] args) throws InterruptedException {
		CreatingThreadsViaRunnable creatingThreadsViaRunnable = new CreatingThreadsViaRunnable();

		Thread thread1 = new Thread(creatingThreadsViaRunnable);
		Thread thread2 = new Thread(creatingThreadsViaRunnable);
		Thread thread3 = new Thread(creatingThreadsViaRunnable);
		Thread thread4 = new Thread(creatingThreadsViaRunnable);
		Thread thread5 = new Thread(creatingThreadsViaRunnable);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		thread5.join();
	}
}

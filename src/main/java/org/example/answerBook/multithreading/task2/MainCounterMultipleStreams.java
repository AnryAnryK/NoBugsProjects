package org.example.answerBook.multithreading.task2;

public class MainCounterMultipleStreams {
	public static void main(String[] args) throws InterruptedException {
		CounterMultipleStreams counterMultipleStreams = new CounterMultipleStreams();

		Runnable task = () -> {
			counterMultipleStreams.streamCounter();
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		Thread thread3 = new Thread(task);
		Thread thread4 = new Thread(task);
		Thread thread5 = new Thread(task);
		Thread thread6 = new Thread(task);
		Thread thread7 = new Thread(task);
		Thread thread8 = new Thread(task);
		Thread thread9 = new Thread(task);
		Thread thread10 = new Thread(task);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();

		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		thread5.join();
		thread6.join();
		thread7.join();
		thread8.join();
		thread9.join();
		thread10.join();

		int result = counterMultipleStreams.getCounter();
		System.out.println("Результат: " + result);

		if (counterMultipleStreams.getCounter() != 10000) {
			throw new RuntimeException("Ожидалось -> 10000, получено -> " + result);
		}
	}
}

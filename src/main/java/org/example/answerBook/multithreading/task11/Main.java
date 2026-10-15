package org.example.answerBook.multithreading.task11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		SynchronizedBlockVsMethod synchronizedBlockVsMethod1 = new SynchronizedBlockVsMethod();

		ExecutorService service = Executors.newFixedThreadPool(3);

		Runnable task1 = () -> {
			for (int i = 0; i < 6; i++) {
				synchronizedBlockVsMethod1.increment();
				synchronizedBlockVsMethod1.incrementWithBlock();
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 6; i++) {
				synchronizedBlockVsMethod1.increment();
				synchronizedBlockVsMethod1.incrementWithBlock();
			}
		};

		Runnable task3 = () -> {
			for (int i = 0; i < 6; i++) {
				synchronizedBlockVsMethod1.increment();
				synchronizedBlockVsMethod1.incrementWithBlock();
			}
		};

		service.submit(task1);
		service.submit(task2);
		service.submit(task3);
		service.shutdown();

		if (service.awaitTermination(2, TimeUnit.SECONDS)) {
			System.out.println("Потоки завершены");
		} else {
			System.out.println("что-то не сработало");
		}

		int expectedResult = 36;
		int actualResult = synchronizedBlockVsMethod1.getNum();
		if (actualResult == expectedResult) {
			System.out.println("Общий 'num' : " + actualResult);
		} else {
			System.out.println("ОШИБКА: ожидалось " + expectedResult + ", получилось " + actualResult);
		}
	}
}

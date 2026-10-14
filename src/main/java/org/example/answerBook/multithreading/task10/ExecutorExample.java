package org.example.answerBook.multithreading.task10;

/*
10. Исполнение задач через ExecutorService
 Создай ExecutorService с фиксированным пулом на 3 потока. Отправь 5 задач, печатающих имя потока и номер задачи.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	public static void main(String[] args) {
		ExecutorService executorExample = Executors.newFixedThreadPool(3);

		for (int i = 1; i < 6; i++) {
			int taskNumber = i;
			Runnable task = () ->
					System.out.println("Поток: " + Thread.currentThread().getName() + " выполняет задачу: " + taskNumber);
			executorExample.submit(task);
		}
		executorExample.shutdown();
	}
}

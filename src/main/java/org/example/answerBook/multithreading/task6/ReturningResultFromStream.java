package org.example.answerBook.multithreading.task6;

/*
6. Возврат результата из потока
 Создай Callable<Integer>, который возвращает квадрат переданного числа. Получи результат через Future.
 */

import java.util.concurrent.*;

public class ReturningResultFromStream {

	public int calculateSquare(int number) throws ExecutionException, InterruptedException {
		final ExecutorService executorService = Executors.newSingleThreadExecutor();
		try {
			Callable<Integer> squareOfNumber = () -> number * number;
			Future<Integer> future = executorService.submit(squareOfNumber);
			return future.get();
		} finally {
			executorService.shutdown();
		}
	}
}

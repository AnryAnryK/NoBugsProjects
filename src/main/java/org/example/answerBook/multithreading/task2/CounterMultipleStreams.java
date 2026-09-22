package org.example.answerBook.multithreading.task2;

/*
2. Счётчик с несколькими потоками
 Реализуй класс с полем counter. Запусти 10 потоков, каждый из которых увеличивает counter 1000 раз.
 Обеспечь синхронизацию, чтобы итоговое значение было корректным.
 */

public class CounterMultipleStreams {
	private int counter;


	public int getCounter() {
		return counter;
	}

	public synchronized void streamCounter() {
		for (int i = 0; i < 1000; i++) {
			counter++;
		}
	}
}

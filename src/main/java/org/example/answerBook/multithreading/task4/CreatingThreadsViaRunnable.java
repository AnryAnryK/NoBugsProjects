package org.example.answerBook.multithreading.task4;

/*
4. Создание потоков через Runnable
 Создай класс, реализующий Runnable, который печатает имя текущего потока. Запусти 5 потоков с этим объектом.
 */

public class CreatingThreadsViaRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Имя текущего потока: " + Thread.currentThread().getName());
	}
}

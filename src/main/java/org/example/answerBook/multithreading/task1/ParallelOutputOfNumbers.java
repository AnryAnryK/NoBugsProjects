package org.example.answerBook.multithreading.task1;

/*
1. Параллельный вывод чисел
 Создай два потока: первый печатает чётные числа от 0 до 10, второй — нечётные.
 Вывод должен идти вперемешку (в зависимости от планировщика).
 */

public class ParallelOutputOfNumbers {

	public static Thread createEvenNumbersThread() {
		return new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println("Чётные значения: " + i);
				}
			}
		});
	}

	public static Thread createOddNumbersThread() {
		return new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				if (i % 2 != 0) {
					System.out.println("Нечётные числа: " + i);
				}
			}
		});
	}
}

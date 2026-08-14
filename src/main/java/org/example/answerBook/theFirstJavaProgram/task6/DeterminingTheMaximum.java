package org.example.answerBook.theFirstJavaProgram.task6;

/*
6. Определение максимума
Метод findMax(int a, int b) возвращает большее из двух чисел.
Подсказка: используй Math.max(a, b).
 */

public class DeterminingTheMaximum {

	public static int findMax(int a, int b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		System.out.println(findMax(10, 12));
	}
}

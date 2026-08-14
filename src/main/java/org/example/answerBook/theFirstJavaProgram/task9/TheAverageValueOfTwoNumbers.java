package org.example.answerBook.theFirstJavaProgram.task9;

/*
9. Среднее значение двух чисел
Метод average(int a, int b) возвращает (a + b) / 2.0.
 */

public class TheAverageValueOfTwoNumbers {

	public static double average(int a, int b) {
		return ((a + b) / 2.0);
	}

	public static void main(String[] args) {
		System.out.println(average(10, 5));
	}
}

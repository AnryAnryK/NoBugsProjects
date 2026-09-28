package org.example.answerBook.exceptionsAndGenerics.task7;

/*
7. Безопасное деление
 Метод divide() с проверкой деления на 0.
 */

public class SafeDivision {

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Ошибка: " + e.getMessage());
		}
		return 0;
	}
}

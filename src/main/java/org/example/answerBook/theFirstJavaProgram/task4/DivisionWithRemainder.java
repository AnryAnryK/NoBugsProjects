package org.example.answerBook.theFirstJavaProgram.task4;

/*
4. Деление с остатком
Метод divide(int a, int b) возвращает результат как double.
Подсказка: важно привести одно из чисел к double: (double) a / b.
 */

public class DivisionWithRemainder {

	public static double divide(int a, int b) {
		return (double) a / b;
	}

	public static void main(String[] args) {
		System.out.println(divide(2,4));
	}
}

package org.example.answerBook.conditionalStatementsAndLoopsInJava.task9;

/*
9. Умножение без оператора *
 Выполни умножение двух положительных чисел с помощью цикла и сложения.
 */

public class MultiplicationByCycle {


	public static int multiplyByCycle(int a, int b) {
		int sum = 0;
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Числа должны быть > 0");
		}
		for (int i = 1; i <= b; i++) {
			sum = sum + a;
		}
		return sum;
	}
}

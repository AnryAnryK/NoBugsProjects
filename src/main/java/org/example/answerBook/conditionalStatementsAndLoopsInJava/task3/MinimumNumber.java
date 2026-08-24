package org.example.answerBook.conditionalStatementsAndLoopsInJava.task3;

/*
3. Минимум из двух чисел
 Сравни два числа и выведи меньшее из них.
 */

public class MinimumNumber {
	public static int getMinimumNumber(int a, int b) {
		return (a < b) ? a : b;

		// можно и так
//		if (a < b) {
//			return a;
//		}
//		return b;
	}
}


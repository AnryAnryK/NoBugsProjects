package org.example.answerBook.conditionalStatementsAndLoopsInJava.task7;

/*
7. Чётные числа от 1 до N
 Выведи все чётные числа от 1 до заданного числа N.
 */

public class EvenNumbers {
	public static void showEvenNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

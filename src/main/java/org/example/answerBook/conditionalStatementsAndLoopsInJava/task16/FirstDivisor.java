package org.example.answerBook.conditionalStatementsAndLoopsInJava.task16;

/*
16. Поиск первого делителя
 Введи число и найди его первый делитель, отличный от 1.
 */

public class FirstDivisor {
	public static void findFirstDivisorDifferentFrom1(int a) {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && i != 1 ) {
				System.out.println("Первый делитель числа " + a + ", отличный от 1 = " + i);
				break;
			}
		}
	}
}

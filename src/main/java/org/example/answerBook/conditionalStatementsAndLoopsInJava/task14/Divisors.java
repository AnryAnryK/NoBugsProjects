package org.example.answerBook.conditionalStatementsAndLoopsInJava.task14;

/*
14. Подсчёт делителей числа
 Введи число и посчитай, сколько у него натуральных делителей.
 */

public class Divisors {
	public static void countingDivisors(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++)
			if (a % i == 0) {
				count++;
				System.out.println(i);
			}
		System.out.println("Кол-во натуральных делителей " + "у числа " + a + " = " + count);
	}
}

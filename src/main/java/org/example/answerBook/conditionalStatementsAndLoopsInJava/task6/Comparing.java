package org.example.answerBook.conditionalStatementsAndLoopsInJava.task6;

/*
6. Сравнение трёх чисел
 Вводятся три числа. Определи наибольшее из них.
 */

import java.util.Arrays;

public class Comparing {

	//отличный вариант, если числе для сравнения не 2 или 3, а ГОРАЗДО БОЛЬШЕ !

	public static int compareMaxNumber(int... numbers) {
		return Arrays.stream(numbers).max().orElseThrow();
	}


	public static int compareMaxNumber3(int a, int b, int c) {

		// вариант 1 - идеальный вариант - можно так
//		return Math.max(a, Math.max(b, c));

		// вариант 2 - можно и так
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}




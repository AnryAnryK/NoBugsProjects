package org.example.answerBook.conditionalStatementsAndLoopsInJava.task8;

/*
8. Сумма чисел от 1 до 100
 Посчитай сумму всех чисел от 1 до 100 включительно.
 */

public class Sum {

	public static void getSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

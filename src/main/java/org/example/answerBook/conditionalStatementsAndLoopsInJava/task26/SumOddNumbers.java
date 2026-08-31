package org.example.answerBook.conditionalStatementsAndLoopsInJava.task26;

/*
26. Сумма только нечётных чисел от 1 до N
 Подсчитай сумму всех нечётных чисел от 1 до заданного N.
 */

public class SumOddNumbers {
	public static void main(String[] args) {
		System.out.println(returnSumOddNumbers(9)); // для числа '9' ожидаемый результат '25'
	}


	public static int returnSumOddNumbers(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
}

package org.example.answerBook.conditionalStatementsAndLoopsInJava.task18;

/*
18. Найти сумму цифр числа
 Введи целое число. Посчитай сумму всех его цифр.
 */

public class DigitsOfTheNumber {
	public static int findDigitsOfTheNumber(int a) {
		int countSumOfDigitOfTheNumber = 0;
		if (a < 11) {
			throw new IllegalArgumentException("Одно число нельзя ни с чем сложить вместе, нужно, чтобы в введённом числе было как минимум две цифры и не 0");
		}
		countSumOfDigitOfTheNumber = countSumOfDigitOfTheNumber + a % 10;
		countSumOfDigitOfTheNumber = countSumOfDigitOfTheNumber + a / 10;
		return countSumOfDigitOfTheNumber;
	}
}

package org.example.answerBook.conditionalStatementsAndLoopsInJava.task21;

/*
21. Реверс числа
 Выведи цифры введённого числа в обратном порядке.
 */

public class Reverse {
	public static void main(String[] args) {
		returnReverseNumber(123045);
		returnReverseNumber(67890);
		returnReverseNumber(0);
		returnReverseNumber(-15);
	}

	public static void returnReverseNumber(int number) {
		if (number == 0) {
			System.out.print("0");
		}
		if (number < 0) {
			System.out.print("-");
			number = -number;
		}
		while (number > 0) {
			System.out.print(number % 10);
			number = number / 10;
		}
		System.out.println(" = реверс числа ");
	}
}

package org.example.answerBook.conditionalStatementsAndLoopsInJava.task1;

/*
1. Определение чётности числа
 Проверь, является ли введённое число чётным или нечётным. Выведи соответствующее сообщение.
 */

public class ParityOfANumber {

	public void isParity(int number) {
		if (number % 2 != 0) {
			System.out.println("Число: " + number + " - нечётное. ");
		} else {
			System.out.println("Число: " + number + " - чётное. ");
		}
	}
}

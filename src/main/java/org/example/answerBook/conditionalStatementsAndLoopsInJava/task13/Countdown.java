package org.example.answerBook.conditionalStatementsAndLoopsInJava.task13;

/*
13. Обратный отсчёт
 Выведи числа от 10 до 1 в обратном порядке. В конце — "Старт!".
 */

public class Countdown {
	public void printCountdownNumbers() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Старт!");
	}
}

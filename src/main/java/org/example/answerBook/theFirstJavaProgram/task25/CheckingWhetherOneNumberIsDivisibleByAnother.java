package org.example.answerBook.theFirstJavaProgram.task25;

/*
25. Проверка, делится ли одно число на другое
Метод isDivisible(int a, int b) возвращает true, если a % b == 0.
Подсказка: сначала проверь b != 0, чтобы избежать деления на ноль.
 */

public class CheckingWhetherOneNumberIsDivisibleByAnother {

	public static boolean isDivisible(int a, int b) {

		if (b != 0 && a % b == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isDivisible(20, 2));
		System.out.println(isDivisible(20, 7));
		System.out.println(isDivisible(20, 0));
	}
}

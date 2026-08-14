package org.example.answerBook.theFirstJavaProgram.task10;

/*
10. Метод isEven(int n) возвращает true, если n % 2 == 0.
 */

public class CheckingTheParity {

	public static boolean isEven(int a) {
		return a % 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(isEven(4));
		System.out.println(isEven(5));
	}
}

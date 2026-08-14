package org.example.answerBook.theFirstJavaProgram.task11;

/*
11. Проверка нечётности
isOdd(int n) возвращает true, если n % 2 != 0.
 */

public class CheckingForOddNumbers {

	public static boolean isEven(int a) {
		return a % 2 != 0;
	}

	public static void main(String[] args) {
		System.out.println(isEven(4));
		System.out.println(isEven(5));
	}
}

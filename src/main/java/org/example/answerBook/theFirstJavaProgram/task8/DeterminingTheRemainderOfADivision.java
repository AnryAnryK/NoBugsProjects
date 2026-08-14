package org.example.answerBook.theFirstJavaProgram.task8;

/*
8. Определение остатка от деления
Метод modulus(int a, int b) возвращает a % b.
 */

public class DeterminingTheRemainderOfADivision {

	public static int modulus(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		System.out.println(modulus(200, 12));
	}
}

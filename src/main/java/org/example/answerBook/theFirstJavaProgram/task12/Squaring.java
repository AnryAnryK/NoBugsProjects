package org.example.answerBook.theFirstJavaProgram.task12;

/*
12. Возведение в квадрат
Метод square(int x) возвращает x * x.
 */

public class Squaring {

	public static int square(int a) {
		return a * a;
	}

	public static void main(String[] args) {
		System.out.println(square(4));
		System.out.println(square(-5));
	}
}

package org.example.answerBook.problemSolving.task11;

/*
Задача 11: Деление на ноль

Описание:
 Метод divide(int a, int b) делит два числа. В случае b == 0 программа падает.
 */

public class DivisionByZero {

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException ae) {
			System.out.println("Деление на 0 невозможно !");
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(divide(1, 0));
	}
}

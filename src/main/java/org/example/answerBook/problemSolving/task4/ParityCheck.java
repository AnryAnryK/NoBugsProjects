package org.example.answerBook.problemSolving.task4;

/*
Задача 4: Проверка чётности

Описание:
 Метод isEven(int n) должен возвращать true, если число делится на 2 без остатка. Но результат неверен для отрицательных чисел.
 */

public class ParityCheck {

	public static boolean isEven(int n) {

		if (n % 2 != 0 || n <= 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isEven(2));
		System.out.println(isEven(3));
		System.out.println(isEven(0));
		System.out.println(isEven(-2));
	}
}

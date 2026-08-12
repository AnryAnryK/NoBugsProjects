package org.example.answerBook.problemSolving.task2;

/*
Задача 2: Проверка положительного числа

Описание:
 Метод isPositive(int n) должен возвращать true, если число строго больше нуля. Однако результат некорректен для нуля.
 */

public class CheckingForAPositiveNumber {

	public static boolean isPositive(int n) {
		if (n <= 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPositive(0));
		System.out.println(isPositive(-1));
		System.out.println(isPositive(1));
	}
}

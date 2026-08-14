package org.example.answerBook.theFirstJavaProgram.task1;

/*
1. Сложение двух чисел
Напиши метод add(int a, int b), который возвращает сумму двух чисел.
Подсказка: просто используй оператор +.
 */

public class AddingTwoNumbers {

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(add(2,4));
	}
}

package org.example.answerBook.theFirstJavaProgram.task5;

/*
5. Проверка деления на ноль
Добавь проверку if (b == 0) перед делением. Если b == 0, выведи "Ошибка: деление на ноль".
 */

public class CheckingDivisionByZero {

	public static double divide(int a, int b) {
		if (b == 0) {
			System.out.println("Ошибка: деление на ноль");
		}
		return (double) a / b;
	}

	public static void main(String[] args) {
		System.out.println(divide(2, 4));
		System.out.println(divide(2, 0));
	}
}

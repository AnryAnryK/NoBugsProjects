package org.example.answerBook.conditionalStatementsAndLoopsInJava.task10;

/*
10. Таблица умножения для числа
 Пользователь вводит число. Построй таблицу умножения от 1 до 10 для этого числа.
 */

import java.util.Scanner;

public class MultiplicationTable {

	public void multiplyNumbers() {
		int n;

		try (Scanner scanner1 = new Scanner(System.in)) {
			while (true) {
				System.out.println("Введите число для таблицы умножения: ");

				if (scanner1.hasNextInt()) {
					n = scanner1.nextInt();
					if (n > 0) {
						break;
					} else {
						System.out.println("Число должно быть > 0");
					}

				} else {
					System.out.println("Это не число или не целое число ! Попробуйте еще раз");
					scanner1.next(); // Забираем ошибочный ввод из памяти, чтобы сканер мог работать дальше
				}
			}
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + "x" + i + " = " + i * n);
			}
		}
	}
}

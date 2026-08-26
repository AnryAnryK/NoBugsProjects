package org.example.answerBook.conditionalStatementsAndLoopsInJava.task19;

/*
19. Поиск максимального числа в серии
 Пользователь вводит числа до ввода нуля. Найди максимальное число из всех введённых.
 */

import java.util.Scanner;

public class MaxNumber {
	public static void findMaxNumber() {
		int maxNumber = Integer.MIN_VALUE;
		int number;
		Scanner scanner = new Scanner(System.in);


		while (true) {
			System.out.println("Введите число ('0' - завершает цикл): ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				if (number == 0) {
					break;
				}
				if (maxNumber < number) {
					maxNumber = number;
				}
			} else {
				String wrongInput = scanner.next();
				System.out.println("Ошибка:" + wrongInput + " Введено не число, а символ или строка !");
			}
		}
		System.out.println("Максимальное число, введённое Пользователем: " + maxNumber);
		scanner.close();
	}
}

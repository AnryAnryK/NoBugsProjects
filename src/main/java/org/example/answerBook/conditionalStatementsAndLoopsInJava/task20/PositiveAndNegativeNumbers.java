package org.example.answerBook.conditionalStatementsAndLoopsInJava.task20;

/*
20. Кол-во положительных и отрицательных
 Пользователь вводит 10 чисел. Посчитай, сколько из них положительные, отрицательные и нули.
 */

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
	public static void countPositiveAndNegativeNumbers() {
		int positiveNumbers = 0;
		int negativeNumbers = 0;
		int zeroNumbers = 0;
		int i;

		try (Scanner scanner = new Scanner(System.in)) {
			for (i = 1; i <= 10; i++) {
				System.out.println("Введите число: " + i + " из оставшихся 10");
				int count = scanner.nextInt();

				if (count < 0) {
					negativeNumbers++;

				} else if (count > 0) {
					positiveNumbers++;

				} else if (count == 0) {
					zeroNumbers++;
				}

				System.out.println("==========================================");
				System.out.println("Отрицательных чисел: " + negativeNumbers);
				System.out.println("Положительных чисел: " + positiveNumbers);
				System.out.println("Нулей: " + zeroNumbers);
			}
		}
	}
}

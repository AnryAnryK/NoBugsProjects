package org.example.dz_4_UslovnieOperatory;

import java.util.Scanner;

public class BreakAndContinueTask {

	public static void main(String[] args) {

		BreakAndContinueTask breakAndContinueTask = new BreakAndContinueTask();

////		// Задача 1
//		breakAndContinueTask.summaryWithoutNegativeNumber();


//		// Задача 2
//		breakAndContinueTask.skippingNumbersDivisibleByThree();


//		// Задача 3
		breakAndContinueTask.printPositiveNumbersSkippingNegativeNumbers();


		// Задача 4
//		breakAndContinueTask.getCommandStop();
	}


	// Задача 1

	public void summaryWithoutNegativeNumber() {
		Scanner scanner = new Scanner(System.in);

		int number1;
		int sum = 0;

		while (true) {
			System.out.println("Введите положительное число : ");
			number1 = scanner.nextInt();
			sum = sum + number1;

			if (number1 < 0) {
				break;
			}
		}
		System.out.println("Сумма  = " + sum);
	}

	// Задача 2

	public void skippingNumbersDivisibleByThree() {

		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("Числа, не делящиеся на 3 : " + i);
		}
	}

	// Задача 3

	public void printPositiveNumbersSkippingNegativeNumbers() {
		Scanner scanner = new Scanner(System.in);

		int number1;

		do {
			System.out.println("Введите число : ");
			number1 = scanner.nextInt();

			if (number1 >= 0) {
				System.out.println("Введено положительно число ");
				continue;
			} System.out.println("Введено отрицательно число ");

		} while (number1 < 0);
	}


	// Задача 4

	public void getCommandStop() {
		Scanner scanner = new Scanner(System.in);

		String commandStop = "stop";
		String command1;

		while (true) {
			System.out.println("Введите команду :");
			command1 = scanner.nextLine();

			if (command1.equals(commandStop)) {
				System.out.println("Введена команда stop");
				break;
			} else System.out.println("Команда stop НЕ введена");
		}
	}
}

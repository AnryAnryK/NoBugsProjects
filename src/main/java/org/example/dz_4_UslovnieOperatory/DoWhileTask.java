package org.example.dz_4_UslovnieOperatory;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {

		DoWhileTask doWhileTask = new DoWhileTask();

//		// Задача 1
//		doWhileTask.checkPositiveNumber();


//		// Задача 2
//		doWhileTask.checkPassword();


//		// Задача 3
//		doWhileTask.printNumbers();


//		// Задача 4
//		doWhileTask.printExit();


//		// Задача 5
//		doWhileTask.checkDigitsInTheNumber();

	}

	// Задача 1

	public void checkPositiveNumber() {
		Scanner scanner = new Scanner(System.in);

		int numberN;

		do {
			System.out.println("Введите положительное число : ");
			numberN = scanner.nextInt();
		} while (numberN <= 0);

		System.out.println("Число " + numberN + " : положительное");
	}

	// Задача 2


	public void checkPassword() {
		Scanner scanner = new Scanner(System.in);

		String correctPassword = "Пароль";
		String enterPassword = "";

		do {
			System.out.println("Введите верный пароль : ");
			enterPassword = scanner.nextLine();

		} while (!enterPassword.equals(correctPassword));

		System.out.println("Введен верный пароль : " + enterPassword);
	}

	// Задача 3


	public void printNumbers() {
		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

	// Задача 4

	public void printExit() {
		Scanner scanner = new Scanner(System.in);

		String printExit = "exit";
		String printString1;

		do {
			System.out.println("Введите команду : ");
			printString1 = scanner.nextLine();
		} while (!printString1.equals(printExit));

		System.out.println("Команда exit выполнена");
	}

	// Задача 5

	public void checkDigitsInTheNumber() {
		Scanner scanner = new Scanner(System.in);
		int numberN;
		int count = 0;

		System.out.println("Введите число : ");
		numberN = scanner.nextInt();

		do {
			count++;
			numberN = numberN / 10;

		} while (numberN != 0);

		System.out.println("Количество цифр в введённом целом числе равно : " + count);
	}

}

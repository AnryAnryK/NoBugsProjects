package org.example.dz_4_UslovnieOperatory;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {

		ForTask forTask = new ForTask();

//		// Задача 1
//		forTask.divisionForThree();


//		// Задача 2
		forTask.summary();


//		// Задача 3
//		forTask.multiplication();


//		// Задача 4
//		forTask.checkSimpleNumber();


//		// Задача 5
//		forTask.printNumbers();

	}


	// Задача 1

	public void divisionForThree() {

		int minNumber = 1;
		int maxNumber = 100;

		for (int i = 1; i >= minNumber && i <= maxNumber; i++) {
			if (i % 3 == 0) {
				System.out.println("Число : " + i + " делится на 3");
			}
		}

	}

	// Задача 2

	public void summary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число n : ");
		int n = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;

		} System.out.println("Сумма чисел от 1 до " + n + " = "  + sum);
	}

	// Задача 3


	public void multiplication() {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		System.out.println("Ввели число : " + number);
		int multiplicationNumber;

		for (int i = 1; i <= 10; i++) {
			multiplicationNumber = i * number;
			System.out.println("Число " + number + " * " + "на число " + i + " = " + multiplicationNumber);
		}

	}

	// Задача 4

	public void checkSimpleNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ввели число : ");
		int number = scanner.nextInt();
		boolean isPrime = true;

		if (number < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Число - простое");
			} else System.out.println("Число - НЕпростое");
		}
	}

	// Задача 5


	public void printNumbers() {
		int i;

		for (i = 1; i <= 10; i++) {
			System.out.println(i);

		}
	}
}



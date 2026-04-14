package org.example.dz_4_UslovnieOperatory;

import java.util.Scanner;

public class WhileTask {

	public static void main(String[] args) {

		WhileTask whileTask = new WhileTask();

////		Задача 1
		whileTask.printFactorial();


////		Задача 2
//		whileTask.printEvenNumber();


//		//		Задача 3
//		whileTask.printCountdown();

	}


	//		Задача 1

	public void printFactorial() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int result = 1;
		int i = 1;
		while (i <= number) {
			result = result * i;
			i++;
		}
		System.out.println("Факториал числа " + number + " равен : " + result);
	}

	//		Задача 2

	public void printEvenNumber() {
		Scanner scanner = new Scanner(System.in);

		int numberN = scanner.nextInt();
		int number1 = 1;

		while (number1 <= numberN) {
			if (number1 % 2 == 0) {
				System.out.println("Четное число : " + number1);
			}
			number1++;
		}
	}

//		Задача 3

	public void printCountdown() {
		Scanner scanner = new Scanner(System.in);

		int numberN = scanner.nextInt();
		int number1 = 1;

		while (numberN >= number1) {
			System.out.println("Выводим положительное число : " + numberN);
			numberN--;
		}
	}
}

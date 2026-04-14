package org.example.dz_4_UslovnieOperatory;

import java.util.Scanner;

public class SwitchTask {


	public static void main(String[] args) {

		SwitchTask st = new SwitchTask();

//		// Задача 1
//		st.printDayOfWeekByNumber();


//		// Задача 2
		st.ticketPrice();


//		// Задача 3
//		st.convertingNumericGradesToAlphabetic();


//		// Задача 4
//		st.textCommands();


//		// Задача 5
//		st.calculating();
	}


	// Задача 1

	public void printDayOfWeekByNumber() {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		switch (number) {

			case 1:
				System.out.println(" : Понедельник");
				break;

			case 2:
				System.out.println(" : Вторник");
				break;

			case 3:
				System.out.println(" : Среда");
				break;

			case 4:
				System.out.println(" : Четверг");
				break;

			case 5:
				System.out.println(" : Пятница");
				break;

			case 6:
				System.out.println(" : Суббота");
				break;

			case 7:
				System.out.println(" : Воскресенье");
				break;

			default:
				System.out.println(" : Введено некорректное значение, диапазон только от 1 до 7");
				break;
		}
	}

	// Задача 2

	public void ticketPrice() {
		Scanner scanner = new Scanner(System.in);

		int day = scanner.nextInt();

		switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Стоимость билета в кино : 300 рублей");
				break;
			case 6:
			case 7:
				System.out.println("Стоимость билета в кино : 450 рублей");
				break;
			default: System.out.println("Введён неверный день недели ! ");
		}
	}

	// Задача 3

	public void convertingNumericGradesToAlphabetic() {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number >= 90 && number <= 100) {
			System.out.println("A");
		} else if (number >= 80 && number <= 89) {
			System.out.println("B");
		} else if (number >= 70 && number <= 79) {
			System.out.println("C");
		} else if (number >= 60 && number <= 69) {
			System.out.println("D");
		} else if (number < 60) {
			System.out.println("F");
		}

	}

	// Задача 4

	public void textCommands() {
		Scanner scanner = new Scanner(System.in);

		String command = scanner.nextLine();

		switch (command) {
			case "start":
				System.out.println("Система запущена");
				break;

			case "stop":
				System.out.println("Система остановлена");
				break;

			case "restart":
				System.out.println("Система перезапущена");
				break;

			case "status":
				System.out.println("Статус Системы");
				break;

			default:
				System.out.println("Данная команда отсутствует в Системе");
				break;
		}
	}

	// Задача 5

	public void calculating() {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		scanner.nextLine();

		System.out.println("Введите оператор (+, -, *, /):");
		String operator = scanner.nextLine();
		//double result;

		switch (operator) {
			case "+":
				System.out.println("Результат сложения = " + (a + b));
				break;

			case "-":
				System.out.println("Результат вычитания = " + (a - b));
				break;

			case "*":
				System.out.println("Результат умножения = " + (a * b));
				break;

			case "/":
				if (b == 0) {
					System.out.println("На " + b + " делить нельзя !");
					break;
				}
				System.out.println("Результат деления = " + a / b);
				break;
		}
	}
}

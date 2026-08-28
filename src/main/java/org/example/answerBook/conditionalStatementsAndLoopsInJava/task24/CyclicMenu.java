package org.example.answerBook.conditionalStatementsAndLoopsInJava.task24;

/*
24. Циклическое меню
 Реализуй консольное меню с пунктами: "1. Старт", "2. Помощь", "0. Выход".
 Программа повторно показывает меню после каждой команды, пока пользователь не выберет "0".
 */

import java.util.Scanner;

public class CyclicMenu {
	public static void main(String[] args) {
		getCyclicMenu();
	}

	public static void getCyclicMenu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Старт ; " + "2. Помощь ; " + "0. Выход");

		while (true) {
			int userInput = scanner.nextInt();
			if (userInput == 1) {
				System.out.println("1. Старт");
			}
			if (userInput == 2) {
				System.out.println("2. Помощь");
			}
			if (userInput == 0) {
				System.out.print("0. Выход");
				break;
			}
			if (userInput > 2 || userInput < 0) {
				System.out.println("Число не может быть не из списка предложенных");
			}
			System.out.println("1. Старт ; " + "2. Помощь ; " + "0. Выход");
		}
		scanner.close();
	}
}

package org.example.answerBook.conditionalStatementsAndLoopsInJava.task23;

/*
23. Угадать число
 Программа случайным образом "задумывает" число от 1 до 5. Пользователь пытается угадать.
 Программа подсказывает: больше/меньше. Игра продолжается, пока число не угадано.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		guessRightNumber();
	}

	public static void guessRightNumber() {

		Random randomNumber = new Random();
		int guessNumber = randomNumber.nextInt(5) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 1 до 5: ");
		int number;

		while (true) {
			number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Введите число > 0");
			}
			if (number > guessNumber) {
				System.out.println("Введите число меньше");
			} else if (number < guessNumber) {
				System.out.println("Введите число больше");
			} else if (number == guessNumber) {
				System.out.println("Вы угадали число !");
				break;
			}
		}
		scanner.close();
	}
}

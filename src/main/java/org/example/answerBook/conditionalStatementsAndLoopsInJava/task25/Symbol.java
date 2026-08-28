package org.example.answerBook.conditionalStatementsAndLoopsInJava.task25;

/*
25. Проверка символа
 Введи один символ. Определи, является ли он цифрой, буквой или чем-то другим.
 */

import java.util.Scanner;

public class Symbol {
	public static void main(String[] args) {
		checkingSymbol();
	}

	public static void checkingSymbol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите символ: ");

		String userStringSymbol = scanner.next();
		char input;

		if (userStringSymbol.length() > 1) {
			System.out.println("введена строка, а не один символ");
		} else {
			input = userStringSymbol.charAt(0);
			if (Character.isDigit(input)) {
				System.out.println("введено число");
			} else if (Character.isLetter(input)) {
				System.out.println("введена буква");
			} else {
				System.out.println("введен какой-то символ");
			}
			scanner.close();
		}
	}
}



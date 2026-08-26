package org.example.answerBook.conditionalStatementsAndLoopsInJava.task12;

/*
12. Пароль с попытками
 Реализуй проверку пароля с максимум тремя попытками. После трёх неудач выводится сообщение "Доступ запрещён".
 */

import java.util.Scanner;

public class Password {
	private String actualPassword = "молоко";

	public void checkPassword() {
		for (int i = 1; i < 4; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите пароль: ");
			String pass = scanner.nextLine();

			if (pass.equals(actualPassword)) {
				System.out.println("Пароль верный");
				return;
			} else {
				System.out.println("Введён неверный Пароль, попытка \"" + i + "\" из 3");
			}
		}
		System.out.println("Доступ запрещён");
	}
}

package org.example.answerBook.collectionsInJava.task14;

/*
14. Обратная сортировка строк
 Пользователь вводит строки. Сохрани их отсортированными по убыванию.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Strings {
	private List<String> strings = new ArrayList<>();

	public void enterStrings() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку (для выхода введите 'exit'): ");
		while (true) {
			String entString = scanner.nextLine();
			if (entString.equalsIgnoreCase("exit")) break;
			strings.add(entString);
		}
		strings.sort(Collections.reverseOrder());
		System.out.println("Введённые строки в обратном порядке:");
		System.out.println("");
	}

	public void showStrings() {
		for (String s : strings) {
			System.out.println(s);
		}
	}
}



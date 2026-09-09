package org.example.answerBook.collectionsInJava.task5;

/*
5. Список гостей без повторов, но с сохранением порядка
 Вводятся имена гостей. Нужно сохранить только уникальные, но в порядке добавления.
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class NamesOfGuests {
	private Set<String> names = new LinkedHashSet<>();

	public void printName() {
		System.out.println("Введите имя (чтобы закончить введите 'exit'): ");
		try (Scanner scanner = new Scanner(System.in)) {
			String enterName;
			while (!(enterName = scanner.nextLine().trim()).equalsIgnoreCase("exit")) {
				if (!enterName.isEmpty()) {
					names.add(enterName);
					System.out.println("Введите следующее имя: ");
				}
			}
			System.out.println("Уникальные имена всех гостей: " + names);
		}
	}
}

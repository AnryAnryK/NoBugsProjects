package org.example.answerBook.collectionsInJava.task8;

/*
8. Проверка на наличие элемента
 Пользователь вводит значение. Нужно определить, есть ли оно в коллекции, и вывести индекс (если применимо).
 */

import java.util.List;
import java.util.Scanner;

public class FindElement {

	public void checkValue(List<String> val) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст (для выхода введите 'exit'): ");
		String result;
		int index = 0;
		while (true) {
			result = scanner.nextLine().trim();

			if ((result).equalsIgnoreCase("exit")) {
				break;
			}
			if (result.isEmpty()) {
				System.out.println("Ничего не введено, введите текст: ");
				continue;
			}
			index = val.indexOf(result);

			if (val.contains(result)) {
				System.out.println("Результат: значение -> " + result + " содержится в коллекции под индексом -> " + index);
			} else {
				System.out.println("Значение -> " + result + " отсутствует в коллекции");
			}
		}
		System.out.println("Программа завершена");
	}
}

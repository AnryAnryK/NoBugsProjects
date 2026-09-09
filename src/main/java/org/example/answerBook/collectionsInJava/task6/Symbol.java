package org.example.answerBook.collectionsInJava.task6;

/*
6. Частота символов в строке
 Пользователь вводит строку. Подсчитай, сколько раз встречается каждый символ.

 нужно читать Строку посимвольно.
 - записывать каждый символ в отдельный List (если символа ещё не было // если символ был - считать их кол-во
 - вывести : символы <-> кол-во символов
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Symbol {

	public void countSymbol() {
		System.out.println("Введите строку (для выхода введите 'exit'): ");
		try (Scanner scanner = new Scanner(System.in)) {

			while (true) {
				String string = scanner.nextLine().trim();
				if (string.equalsIgnoreCase("exit")) {
					break;
				}

				Map<Character, Integer> frequencyMap = new HashMap<>();
				for (Character c : string.toCharArray()) {
					frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
				}
				System.out.println("Символов в строке " + string + " равно: ");
				for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
					System.out.println("Символ: " + entry.getKey() + " -> " + entry.getValue());
				}
				System.out.println();
				System.out.println("Введите следующую строку (или 'exit' для выхода): ");
			}
		}
	}
}

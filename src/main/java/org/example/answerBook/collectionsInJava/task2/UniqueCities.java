package org.example.answerBook.collectionsInJava.task2;

/*
2. Уникальные города
 При вводе городов исключай повторы. Порядок не важен.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCities {
	private Set<String> setOfUniqueCities = new HashSet<>();

	Scanner scanner = new Scanner(System.in);

	public void addToListOfUniqueCities() {
		System.out.println("Введите уникальный город (для окончания цикла введите 'exit'): ");

		while (true) {
			String uniqueCity = scanner.nextLine();
			if (uniqueCity.equalsIgnoreCase("exit")) {
				break;
			}
			setOfUniqueCities.add(uniqueCity);
		}
		scanner.close();
	}

	public void printListOfUniqueCities(){
		setOfUniqueCities.forEach(System.out::println);
	}
}

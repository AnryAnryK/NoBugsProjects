package org.example.answerBook.collectionsInJava.task9;

/*
9. Удаление дубликатов из списка чисел
 Вводится список чисел. Удали повторы и выведи результат.
 */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Dublicates {

	public void deleteDublicates(List<Integer> num) {
		List<Integer> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число/числа (для выхода введите 'exit'): ");
		while (true) {
			String result = scanner.nextLine();
			if (result.equalsIgnoreCase("exit")) {
				break;
			}
			try {
				numbers.add(Integer.parseInt(result));
			} catch (NumberFormatException e) {
				System.out.println("Введено не число, исправьтесь !");
			}
			if (numbers.size() > num.size()) {
				System.out.println("Список для сравнения завершён, больше вводить значения нельзя -> введите 'exit' для выхода");
				break;
			}
			if (numbers.equals(num)) {
				System.out.println("Ввод совпал с эталоном: " + numbers);
			} else {
				List<Integer> uniqueNumders = new ArrayList<>(new LinkedHashSet<>(numbers));
				System.out.println("Уникальные числа: " + uniqueNumders);
			}
		}
	}
}


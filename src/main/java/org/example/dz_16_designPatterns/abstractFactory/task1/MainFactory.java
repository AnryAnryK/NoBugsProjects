package org.example.dz_16_designPatterns.abstractFactory.task1;

import java.util.Scanner;

public class MainFactory {
	public static void main(String[] args) {

		System.out.println("Выберите стиль мебели: modern или classic (exit - для завершения программы):");

		try (Scanner scanner = new Scanner(System.in)) {
			String result;
			while (true) {
				result = scanner.nextLine().trim();
				if (result.equalsIgnoreCase("exit")) {
					break;
				}

				Factory factory;

				if (result.equalsIgnoreCase("modern")) {
					factory = new ModernFactory();
				} else if (result.equalsIgnoreCase("classic")) {
					factory = new ClassicFactory();
				} else {
					System.out.println("Неизвестный стиль. Попробуйте снова.");
					continue;
				}

				Chair chair1 = factory.makeChair();
				Table table1 = factory.makeTable();

				System.out.println("Создана мебель в стиле " + result + " :");
				System.out.println(chair1.makeChair());
				System.out.println(table1.makeTable());
				System.out.println("Введите следующий стиль (или exit): ");
			}
		}
		System.out.println("Программа завершена.");
	}
}

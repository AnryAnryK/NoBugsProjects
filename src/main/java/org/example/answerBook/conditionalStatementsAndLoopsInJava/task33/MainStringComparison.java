package org.example.answerBook.conditionalStatementsAndLoopsInJava.task33;

import java.util.Scanner;

public class MainStringComparison {
	public static void main(String[] args) {
		StringComparison stringComparison1 = new StringComparison();

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Введите строку 1: ");
			String sc1 = scanner.nextLine();

			System.out.println("Введите строку 2: ");
			String sc2 = scanner.nextLine();

			System.out.println(stringComparison1.isEqual(sc1, sc2));
		}

	}
}

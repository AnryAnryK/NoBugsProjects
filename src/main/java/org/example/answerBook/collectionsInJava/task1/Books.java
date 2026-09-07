package org.example.answerBook.collectionsInJava.task1;

/*
1. Хранение списка книг
 Пользователь вводит названия книг. Храни все введённые книги и выведи их в порядке добавления.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
	private List<String> listOfBooks = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public void addBook() {

		System.out.println("Введите названия книг (для завершения введите 'exit'): ");
		while (true) {
			String bookName = scanner.nextLine();
			if (bookName.equalsIgnoreCase("exit")) {
				break;
			}
			listOfBooks.add(bookName);
		}
		scanner.close();
	}

	public void printListOfBooks() {
		listOfBooks.forEach(System.out::println);
	}
}

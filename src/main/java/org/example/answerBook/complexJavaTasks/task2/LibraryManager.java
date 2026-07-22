package org.example.answerBook.complexJavaTasks.task2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

	List<Books> booksList = new ArrayList<>();
	boolean isAvailable;


	public void addBookToTheLibrary(Books book) {
		if (book == null) {
			System.out.println("Ошибка: книга не может быть null");
			return;
		}
		booksList.add(book);
		System.out.println("Книга: " + book.getTitle() + " добавлена в библиотеку");
	}


	public boolean isAvailable(String title, String author) {
		for (Books book : booksList) {
			if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
				if (book.isAvailable()) {
					book.setAvailable(true);
					System.out.println("Книга: " + book.getTitle() + " " + book.getAuthor() + " - свободна");
					return true;
				} else {
					book.setAvailable(false);
					System.out.println("Книга: " + book.getTitle() + " " + book.getAuthor() + " - занята");
					return false;
				}
			}
		}
		System.out.println("Книга не найдена ни среди занятых, ни среди свободных");
		return false;
	}

	public void findBookByAuthor(String author) {
		if (author == null) {
			System.out.println("Ошибка: имя автора не может быть пустым");
			return;
		}

		boolean bookIsAvailable = false;
		for (Books book : booksList) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println("Книга под Названием: " + book.getTitle() + ", Автора: " + book.getAuthor() + " - найдена в Библиотеке");
				bookIsAvailable = true;
			}
		}

		if (!bookIsAvailable) {
			System.out.println("Книга Автора: " + author + " - не найдена в Библиотеке");
		}
	}

	public void findBookByPublishYear(int publishYear) {
		if (publishYear <= 0) {
			System.out.println("Ошибка, год издания не может быть меньше или равен 0");
			return;
		}
		boolean found = false;
		for (Books book : booksList) {
			if (book.getPublishYear() == publishYear) {
				System.out.println("Книга под Названием: " + book.getTitle() +
						", Автора: " + book.getAuthor() +
						", Год: " + book.getPublishYear() + " - найдена в Библиотеке");
				found = true;
			}
		}
		if (!found) {
			System.out.println("Книга с Годом издания: " + publishYear + " - не найдена в Библиотеке");
		}
	}
}


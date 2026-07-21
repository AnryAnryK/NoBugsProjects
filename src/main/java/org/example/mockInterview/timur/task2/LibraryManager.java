package org.example.mockInterview.timur.task2;

import java.util.List;

public class LibraryManager {

	public void addBookToLibrary(Library library, Book book) throws Exception {

		if (library == null || library.getListOfBooks() == null || library.getTitle() == null || book == null) {
			throw new IllegalArgumentException("Библиотека или список книг не могут быть null");
		}

		if (book == null) {
			throw new IllegalArgumentException("Книга не может быть null");
		}


		for (Book existingBook : library.getListOfBooks()) {
			if ((existingBook.equals(book))) {
				existingBook.setCountOfBooks(existingBook.getCountOfBooks() + book.getCountOfBooks());
				return;
			}
		}
		library.getListOfBooks().add(new Book(book.getTitle(), book.getAuthor(), book.getCountOfBooks()));
	}

	public boolean libraryGivesBookToReader(Library library, Book book) throws Exception {

		if (library == null || library.getListOfBooks() == null) {
			throw new IllegalArgumentException("Библиотека или список книг не могут быть null");
		}
		if (book == null) {
			throw new IllegalArgumentException("Книга не может быть null");
		}

		List<Book> listOfBooks = library.getListOfBooks();

		if (listOfBooks.isEmpty()) {
			System.out.println("В библиотеке нет книг");
			return false;
		}

		for (int i = 0; i < listOfBooks.size(); i++) {
			Book currentBook = listOfBooks.get(i);
			if (currentBook.equals(book)) {
				if (currentBook.getCountOfBooks() > 0) {
					currentBook.setCountOfBooks(currentBook.getCountOfBooks() - 1);
					if (currentBook.getCountOfBooks() == 0) {
						library.getListOfBooks().remove(i);
					}
					System.out.println("Книга: " + book.getTitle() + ", " + book.getAuthor() + " : выдана");
					return true;
				} else {
					System.out.println("Книга: " + book.getTitle() + ", " + book.getAuthor() + " отсутствует в Библиотеке");
					return false;
				}
			}
		}
		System.out.println("Книга '" + book.getTitle() + "' отсутствует в каталоге");
		return false;
	}

	public boolean libraryTakesBookFromReader(Library library, Book book) throws Exception {

		if (library == null || library.getListOfBooks() == null) {
			throw new IllegalArgumentException("Библиотека или список книг не могут быть null");
		}
		if (book == null) {
			throw new IllegalArgumentException("Книга не может быть null");
		}

		List<Book> listOfBooks = library.getListOfBooks();

		for (Book existingBook : listOfBooks) {
			if (existingBook.equals(book)) {
				existingBook.setCountOfBooks(existingBook.getCountOfBooks() + 1);
				return true;
			}
		}
		library.getListOfBooks().add(new Book(book.getTitle(), book.getAuthor(), 1));
		return true;
	}

	public void showListOfAvailableBooksInTheLibrary(Library library) {

		if (library == null || library.getListOfBooks() == null) {
			System.out.println("Библиотека или список книг не могут быть null");
			return;
		}

		List<Book> listOfBooks = library.getListOfBooks();

		if (listOfBooks.isEmpty()) {
			System.out.println("В библиотеке " + library.getTitle() + " нет доступных книг");
			return;
		}

		System.out.println("Доступные книги в " + library.getTitle() + ": ");

		for (Book book : listOfBooks) {
			System.out.println(book
			);
		}
	}
}




package org.example.mockInterview.timur.task2;

public class LibraryManager {

	public void addBookToLibrary(Library library, Book book) {
		library.getListOfBooks().add(book);
	}

	public boolean libraryGivesBookToReader(Book book) {
		if (book.getCountOfBooks() <= 0) {
			System.out.println("В Библиотеке книг нет !");
			return false;
		}
		int currentNumberOfBooks = book.getCountOfBooks();
		book.setCountOfBooks(currentNumberOfBooks - 1);
		return true;
	}

	public boolean libraryTakesBookFromReader(Book book) {
		int currentNumberOfBooks = book.getCountOfBooks();
		book.setCountOfBooks(currentNumberOfBooks + 1);
		return true;
	}

	public void showListOfAvailableBooksInTheLibrary(Library library) {
//		System.out.println("Доступные книги в " + library.getTitle() + ":");

		for (Book book : library.getListOfBooks()) {
			System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getCountOfBooks());
		}
	}
}

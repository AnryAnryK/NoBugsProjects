package org.example.answerBook.complexJavaTasks.task2;

/*
Учет книг в библиотеке
 Реализуй класс LibraryManager, который хранит книги (название, автор, год издания, статус доступности).
 Реализуй методы поиска по автору, по году и изменения статуса книги (занята / доступна).
 */

public class Main {

	public static void main(String[] args) {
		Books book1 = new Books("Лукоморье", "Пушкин", 1890, true);
		Books book2 = new Books("Война и мир", "Толстой", 1890, true);
		Books book3 = new Books("Мир", "Болстой", 1890, false);

		LibraryManager lm1 = new LibraryManager();

		lm1.addBookToTheLibrary(book1);
		lm1.addBookToTheLibrary(book2);
		lm1.addBookToTheLibrary(book3);

		lm1.findBookByAuthor("Пушкин");
		lm1.findBookByAuthor("Мушкин");

		lm1.findBookByPublishYear(1890);
		lm1.findBookByPublishYear(1900);

				
		lm1.isAvailable("Лукоморье", "Пушкин");
		lm1.isAvailable("Мир", "Болстой");
	}
}

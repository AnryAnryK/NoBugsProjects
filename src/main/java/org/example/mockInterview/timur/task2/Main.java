package org.example.mockInterview.timur.task2;

/*
Дано:

Библиотека. У неё есть:
Название.
Список книг.


У Книг есть:
Название.
Автор.
Кол-во доступных экземпляров.


Реализовать Систему, которая может:
Добавить Книгу в Библиотеку.
Выдать Книгу Читателю.
Вернуть Книгу обратно в Библиотеку.
Показать Список доступных Книг.


Правила:
Книгу можно выдать, только если есть хотя бы один доступный экземпляр Книги.
При Выдаче кол-во уменьшается на 1.
При Возврате кол-во увеличивается на 1.


Пример:
В Библиотеке есть Книги:
"1984" - Оруэлл - 2
"Мастер и Маргарита" - Булгаков - 1

После одной выдачи:
"1984" - 1
"Мастер и Маргарита" - 1

После возврата:
"1984" - 2
"Мастер и Маргарита" - 1

 */


import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		Book book1 = new Book("450 градусов по Фаренгейту", "Рэй Брэдбери", 1);
		Book book2 = new Book("Винни-Пух", "Александр Милн", 1);

		Library library1 = new Library("Ленинская библиотека", new ArrayList<>(List.of(book1, book2)));
		LibraryManager libraryManager = new LibraryManager();
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		libraryManager.libraryGivesBookToReader(library1, book1);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		libraryManager.libraryTakesBookFromReader(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);
	}
}

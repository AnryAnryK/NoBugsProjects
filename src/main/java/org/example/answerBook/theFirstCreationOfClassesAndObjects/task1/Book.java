package org.example.answerBook.theFirstCreationOfClassesAndObjects.task1;

/*
1. Класс Book
 Напиши класс Book, который описывает книгу.
Внутри класса должны быть два поля: title (название книги, тип String) и author (имя автора, тип String).
Создай конструктор, который принимает оба значения и сохраняет их в поля.
Добавь метод printInfo(), который выводит строку вида: Название: <title>, Автор: <author>.
Подсказка: используй System.out.println.
 */

public class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void printInfo() {
		System.out.println("Название: " + title + "; " + "Автор: " + author);
	}

	public static void main(String[] args) {

		Book book1 = new Book("Сказки", "Пушкин");
		Book book2 = new Book("Евгений Онегин", "Пушкин");
		book1.printInfo();
		book2.printInfo();
	}
}

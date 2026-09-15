package org.example.answerBook.objectClassAndMethods.task1;

/*
Класс Book
 Создай класс с полями title, author, year. Переопредели toString() так, чтобы возвращалась строка: "Книга: <title> (<year>), автор — <author>".
 */

public class Book {
	public static void main(String[] args) {
		Book book = new Book("О чём-то", "Кто-то", 1845);
		System.out.println(book);
	}

	private String title;
	private String author;
	private int year;

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Книга: " + title + " (" + year + "), автор — " + author;
	}
}

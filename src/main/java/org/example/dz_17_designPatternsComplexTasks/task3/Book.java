package org.example.dz_17_designPatternsComplexTasks.task3;

/*
Разработка библиотеки для виртуальной библиотеки книг
Цель: Создать библиотеку, которая предоставляет функции просмотра каталога книг, чтения книг и загрузки их для офлайн чтения, с особым вниманием к ленивой загрузке и эффективному управлению ресурсами.

Паттерны проектирования:
Proxy: Используйте Lazy Loading Proxy для отложенной загрузки книг, что позволяет уменьшить начальную нагрузку на систему и использовать ресурсы эффективнее.
Builder: Для построения сложных объектов книг, которые могут включать различные компоненты, такие как обложка, описание, содержание, авторы.

Архитектура библиотеки:
BookBuilder: Класс для построения книг с различными характеристиками.
Book: Базовый класс для книги, содержит основную информацию и методы доступа.
BookProxy: Proxy класс, который управляет доступом к объекту Book, осуществляя загрузку данных только по необходимости (например, при первом обращении к содержанию книги).

Пример использования:
 */

public class Book {
	private final String title;
	private final String author;
	private final String description;
	private final String content;

	public Book(String title, String author, String description, String content) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
	}

	public Book(BookBuilder bookBuilder) {
		this.title = bookBuilder.title;
		this.author = bookBuilder.author;
		this.description = bookBuilder.description;
		this.content = bookBuilder.content;
	}

	public Book(Book book) {
		this.title = book.title;
		this.author = book.author;
		this.description = book.description;
		this.content = book.content;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", author='" + author + '\'' +
				", description='" + description + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}

package org.example.dz_17_designPatternsComplexTasks.task3;

public class BookProxy extends Book {
	private Book book;
	private String loadedContent;

	public BookProxy(Book book) {
		super(book);
		this.book = book;
	}

	public String getContent() {
		if (loadedContent == null) {
			System.out.println("Загрузка книги");
			this.loadedContent = book.getContent();
		}
		return this.loadedContent;
	}
}


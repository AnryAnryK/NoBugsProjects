package org.example.dz_17_designPatternsComplexTasks.task3;

public class BookBuilder {
	String title;
	String author;
	String description;
	String content;

	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}

	public BookBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public BookBuilder setContent(String content) {
		this.content = content;
		return this;
	}

	public Book build() {
		return new Book(this);
	}
}

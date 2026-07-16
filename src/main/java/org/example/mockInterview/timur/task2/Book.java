package org.example.mockInterview.timur.task2;

public class Book {

	private String title;
	private String author;
	private int countOfBooks;


	public Book(String title, String author, int countOfBooks) {
		this.title = title;
		this.author = author;
		this.countOfBooks = countOfBooks;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCountOfBooks() {
		return countOfBooks;
	}

	public void setCountOfBooks(int countOfBooks) {
		this.countOfBooks = countOfBooks;
	}

	@Override
	public String toString(){
		return "Название: " + title + ", " + "Автор: " +  author + ", " + "Количество: "  + countOfBooks + "; ";
	}
}

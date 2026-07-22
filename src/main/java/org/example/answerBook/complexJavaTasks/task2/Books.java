package org.example.answerBook.complexJavaTasks.task2;

public class Books {

	private String title;
	private String author;
	private int publishYear;
	private boolean isAble;


	public Books(String title, String author, int publishYear, boolean isAble) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
		this.isAble = isAble;
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

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public boolean isAvailable() {
		return isAble;
	}

	public void setAvailable(boolean available) {
		isAble = available;
	}

	@Override
	public String toString() {
		return "Книга с Названием: " + title + " , Автора:" + author + ", Годом Издания: " + publishYear + "найдена: ";
	}
}

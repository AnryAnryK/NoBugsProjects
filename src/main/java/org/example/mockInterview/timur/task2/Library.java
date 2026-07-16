package org.example.mockInterview.timur.task2;

import java.util.List;

public class Library {

	private String title;
	private List<Book> listOfBooks;

	public Library(String title, List<Book> listOfBooks) {
		this.title = title;
		this.listOfBooks = listOfBooks;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
}

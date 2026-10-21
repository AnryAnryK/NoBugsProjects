package org.example.answerBook.collectionsInJava.task27;

public class Subcategory implements Comparable<Subcategory> {
	private final String title;

	public Subcategory(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Subcategory o) {
		return this.title.compareTo(o.title);
	}
}

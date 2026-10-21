package org.example.answerBook.collectionsInJava.task27;

/*
27. Поддержка упорядоченных категорий и подкатегорий
 Храни категории и внутри них подкатегории. Все — в порядке алфавита.
 */

import java.util.Set;
import java.util.TreeSet;

public class Category implements Comparable<Category> {
	private String title;
	private Set<Subcategory> subcategories;

	public Category(String title) {
		this.title = title;
		this.subcategories = new TreeSet<>();
	}

	public void add(Subcategory subcategory) {
		subcategories.add(subcategory);
	}

	public String getTitle() {
		return title;
	}

	public Set<Subcategory> getCategories() {
		return subcategories;
	}

	@Override
	public String toString() {
		return "{" + title + ", " + subcategories +	"}";
	}

	@Override
	public int compareTo(Category o) {
		return this.title.compareTo(o.title);
	}
}

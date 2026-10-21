package org.example.answerBook.collectionsInJava.task27;

public class Main {
	public static void main(String[] args) {
		Subcategory subcategorySingers = new Subcategory("Певцы");
		Subcategory subcategoryDancers = new Subcategory("Танцоры");
		Subcategory subcategoryFootballPlayers = new Subcategory("Футболисты");
		Subcategory subcategoryWeightlifters = new Subcategory("Штангисты");

		Category categoryArt = new Category("Искусство");
		Category categorySport = new Category("Спорт");

		categoryArt.add(subcategorySingers);
		categoryArt.add(subcategoryDancers);

		categorySport.add(subcategoryFootballPlayers);
		categorySport.add(subcategoryWeightlifters);

		System.out.println("Категории: " + categoryArt.getTitle() + " -> " + categoryArt.getCategories());
		System.out.println("Категории: " + categorySport.getTitle() + " -> " + categorySport.getCategories());

	}
}

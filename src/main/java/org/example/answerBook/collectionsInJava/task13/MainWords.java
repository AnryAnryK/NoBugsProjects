package org.example.answerBook.collectionsInJava.task13;

public class MainWords {
	public static void main(String[] args) {
		Words words = new Words();
		words.addText("Икс ИКС Икс Икс");
		words.addText("Игрик Игрик Игрик");
		words.addText("Зет Зет");
		words.addText("Омега");

		words.showTopThreeWords();
	}
}

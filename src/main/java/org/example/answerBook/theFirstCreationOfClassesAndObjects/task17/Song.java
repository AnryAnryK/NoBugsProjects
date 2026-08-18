package org.example.answerBook.theFirstCreationOfClassesAndObjects.task17;

/*
17. Класс Song
 Класс Song с полями title (String) и duration (int, в секундах).
Метод play() выводит: Сейчас играет: <title> (<duration> секунд).
 */

public class Song {
	private String title;
	private int duration;

	public Song(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}

	public void play(){
		System.out.println("Сейчас играет: \"" + title + "\" (" + duration + " секунд).");
	}
}

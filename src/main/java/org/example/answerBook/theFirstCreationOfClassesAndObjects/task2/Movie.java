package org.example.answerBook.theFirstCreationOfClassesAndObjects.task2;

/*
2. Класс Movie
 Создай класс Movie, описывающий фильм.
Поля: name (название, тип String), year (год выхода, тип int).
Добавь конструктор, геттеры и метод describe(), который выводит описание фильма: Фильм "<name>" вышел в <year> году.
 */

public class Movie {

	private String name;
	private int year;

	public Movie(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void describe() {
		System.out.println("Фильм: \"" + getName() + "\" вышел в \"" + getYear() + "\" году");
	}


	public static void main(String[] args) {
		Movie movie1 = new Movie("Титаник", 1996);
		Movie movie2 = new Movie("Такси", 1997);
		movie1.describe();
		movie2.describe();
	}
}

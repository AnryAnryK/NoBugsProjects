package org.example.answerBook.theFirstCreationOfClassesAndObjects.task8;

/*
8. Класс Dog
 Определи класс Dog с полями name и breed (оба типа String).
Добавь метод bark(), который выводит Собака <name> породы <breed> лает: Гав-гав!.
 */

public class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}


	public void bark() {
		System.out.println("Собака \"" + getName() + "\" породы \"" + getBreed() + "\" лает: Гав-гав!");

	}
}

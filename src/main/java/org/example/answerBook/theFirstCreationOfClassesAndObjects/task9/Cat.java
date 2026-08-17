package org.example.answerBook.theFirstCreationOfClassesAndObjects.task9;

/*
9. Класс Cat
 Создай класс Cat с полями name (String) и age (int).
Добавь два метода:

meow() — выводит Кошка <name> мяукает.
sleep() — выводит Кошка <name> спит.
 */

public class Cat {

	private String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void meow() {
		System.out.println("Кошка \"" + name + "\" мяукает");
	}

	public void sleep() {
		System.out.println("Кошка \"" + name + "\" спит");
	}
}

package org.example.answerBook.oopPrinciplesInJava.task2;

/*
2. Животные и поведение (Наследование)
 Разработай базовый класс Animal, содержащий имя и метод makeSound().
Создай подклассы Dog, Cat, Cow, каждый из которых реализует makeSound() по-своему.
Добавь метод describe() в базовом классе, который использует makeSound() внутри.
Пояснение: задача на наследование и переопределение поведения через переопределённый метод.
 */

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void makeSound();


	public  final void describe() {
		System.out.println("Описание поведения у: " + getName());
		makeSound();
	}
}

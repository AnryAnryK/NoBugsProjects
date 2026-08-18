package org.example.answerBook.staticFinalAccessModifiers.task4;

/*
4. Инкапсуляция возраста
 Определи класс Person с полем age.
Поле не должно быть доступно напрямую — возраст должен устанавливаться и читаться только через методы.
Добавь метод увеличения возраста.
Пояснение: продумай, какие модификаторы доступа подходят для обеспечения инкапсуляции.
 */

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0){
			throw  new IllegalArgumentException("Возраст не может быть меньше 0");
		}
		this.age = age;
	}

	public void addAge(int addingAge) {
		if (addingAge <= 0){
			throw new IllegalArgumentException("К возрасту нельзя прибавлять отрицательные значения или 0");
		}
		age = age + addingAge;
	}
}

package org.example.answerBook.theFirstCreationOfClassesAndObjects.task4;

/*
4. Класс User
 Создай класс User, представляющий пользователя.
Поля: username (тип String), age (тип int).
Реализуй метод introduce(), который выводит приветствие: Привет, меня зовут <username>, мне <age> лет.
 */

public class User {
	private String username;
	private int age;

	User(String username, int age) {
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public void introduce(){
		System.out.println("Привет, меня зовут \"" +getUsername() + "; мне \"" + getAge() + "\" лет");
	}

	public static void main(String[] args) {
		User user1 = new User("Вася", 22);
		user1.introduce();
	}
}

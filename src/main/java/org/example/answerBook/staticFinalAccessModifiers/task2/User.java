package org.example.answerBook.staticFinalAccessModifiers.task2;

/*
2. Счётчик пользователей
 Создай класс User, где каждый пользователь имеет имя.
Класс должен вести подсчёт общего количества созданных пользователей. Этот счётчик должен автоматически увеличиваться при создании каждого нового объекта.
Также добавь возможность вывести общее количество пользователей.
Пояснение: реши, как отслеживать общее количество объектов независимо от экземпляров.
 */

public class User {
	private String name;
	private static int userCount = 0;

	public User(String name) {
		this.name = name;
		userCount++;
	}

	public String getName() {
		return name;
	}

	public static void printTotalUserCount() {
		System.out.println("Всего пользователей создано: " + userCount);
	}
}

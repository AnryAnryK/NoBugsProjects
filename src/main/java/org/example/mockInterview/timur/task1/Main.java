package org.example.mockInterview.timur.task1;

/*
Даны две сущности:

Пользователь 1:
Имя
Фамилия
Список Мест работ


Пользователь 2:
Имя
Фамилия
Список Мест работ


Задача:
реализовать сравнение двух сущностей

Сравнение двух одинаковых Пользователей (у которых все сущности - идентичны) должно возвращать true.

 */

import java.util.List;

public class Main {


	public static void main(String[] args) {
		List<String> placesOfJobUser1 = List.of("Газпром", "Роснефть", "Газпром-Роснефть");
		List<String> placesOfJobUser2 = List.of("Газпром", "Роснефть", "Газпром-Роснефть");
		List<String> placesOfJobUser3 = List.of("Газпром", "Роснефть", "Алмаз-Антей");

		User user = new User("Тимур", "Тимурский", placesOfJobUser1);
		User user2 = new User("Тимур", "Тимурский", placesOfJobUser2);
		User user3 = new User("Тимур", "Тимурский", placesOfJobUser3);

		System.out.println(user.equals(user2));
		System.out.println(user.equals(user3));
	}
}

package org.example.dz_14_ComplexTasks;

/*
Задача 2: Валидатор пользовательских данных

Описание:
Разработайте систему валидации для модели данных пользователя, которая проверяет корректность имени, возраста и электронной почты.
Валидация должна управляться через глобальный флаг validationEnabled, который может быть включен или выключен. Если данные не проходят валидацию,
должно выбрасываться специализированное исключение InvalidUserException.

Модель данных:
User: Класс пользователя с атрибутами для имени, возраста и электронной почты.
Класс валидатора: UserValidator: Сервис, который предоставляет методы для проверки объектов User на соответствие определенным правилам.

Функциональные требования:
Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
Проверка email: Email должен соответствовать стандартному формату электронной почты.
Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.
 */


public class User {
	private String name;
	private Integer age;
	private String email;


	public User(String name, Integer age, String email) throws InvalidUserException {
		this.name = name;
		this.age = age;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
}



package org.example.dz_14_ComplexTasks.task3;

/*
Задача 3: Учёт оценок студентов

Описание:
Создайте систему для управления и анализа оценок студентов, используя обобщённый подход. Система должна поддерживать различные типы числовых оценок,
обеспечивать валидацию входных данных и предоставлять функционал для расчёта статистических показателей.

Функциональные требования:

+ Класс StudentGrade<T>:
+ Поля для имени студента, предмета и оценки.
?+- Оценка должна быть типа T, который расширяет класс Number.
+ Конструктор для инициализации всех полей.
+ Геттеры для доступа к полям.

+ Сервис GradeService<T>:
+ Список List<StudentGrade<T>> для хранения оценок.
-+ Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.

- Метод для расчёта среднего значения оценок по конкретному предмету.
+ Обработка исключений через InvalidGradeException, если оценка некорректна.

Многопоточность:
Обеспечение потокобезопасности при добавлении оценок с использованием synchronized.
 */

public class StudentGrade<T> {

	private final String name;
	private final String subject;
	private final T mark;

	public StudentGrade(String name, String subject, T mark) {
		this.name = name;
		this.subject = subject;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public T getMark() {
		return mark;
	}
}


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

public class StudentGrade<T> extends Number {

	private String name;
	private String subject;
	private Integer mark;

	StudentGrade(String name, String subject, Integer mark) {
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

	public Integer getMark() {
		return mark;
	}


	@Override
	public int intValue() {
		return 0;
	}

	@Override
	public long longValue() {
		return 0;
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public double doubleValue() {
		return 0;
	}
}

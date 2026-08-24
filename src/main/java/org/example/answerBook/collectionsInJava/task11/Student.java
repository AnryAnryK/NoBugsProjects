package org.example.answerBook.collectionsInJava.task11;

/*
11. Группировка студентов по курсам
 У каждого студента есть курс (1, 2, 3…). Нужно сгруппировать студентов по курсам.
 */

public class Student {
	private String name;
	private int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Студент: " + getName() + ", " + "Курс: " + getCourse();
	}
}

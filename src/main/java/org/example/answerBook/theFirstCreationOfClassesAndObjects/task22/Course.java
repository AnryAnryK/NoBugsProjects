package org.example.answerBook.theFirstCreationOfClassesAndObjects.task22;

/*
22. Класс Course
 Класс Course с полем name (String) и studentsEnrolled (int).
Метод addStudent() увеличивает счётчик на 1.
Метод printInfo() — выводит название курса и количество студентов.
 */

public class Course {
	private String name;
	private int studentsEnrolled;

	public Course(String name, int studentsEnrolled) {
		this.name = name;
		this.studentsEnrolled = studentsEnrolled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentsEnrolled() {
		return studentsEnrolled;
	}

	public void setStudentsEnrolled(int studentsEnrolled) {
		this.studentsEnrolled = studentsEnrolled;
	}

	public void addStudent() {
		studentsEnrolled++;
	}

	public void printInfo() {
		System.out.println("Курс: " + getName() + "; " + "кол-во студентов на курсе: " + getStudentsEnrolled());
	}
}

package org.example.answerBook.theFirstCreationOfClassesAndObjects.task15;

/*
15. Класс Student
 Определи класс Student с полями name (String) и gpa (double).
Метод isHonorsStudent() возвращает true, если gpa > 4.5.
Метод printStatus() выводит, в зависимости от результата, отличник ли студент.
 */

public class Student {

	private String name;
	private double gpa;
	private final double GPA_MARK = 4.5 ;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public boolean isHonorsStudent() {
		return gpa > GPA_MARK;
	}

	public void printStatus() {
		if (gpa > GPA_MARK) {
			System.out.println("Студент - отличник");
		} else {
			System.out.println("Студент - не отличник");
		}
	}
}

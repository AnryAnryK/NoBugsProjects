package org.example.answerBook.collectionsInJava.task11;

import java.util.ArrayList;
import java.util.List;

public class MainStudents {
	public static void main(String[] args) {
		Student student1 = new Student("Иванов Иван", 1);
		Student student2 = new Student("Петр Петров", 1);
		Student student3 = new Student("Сидр Сидоров", 2);
		Student student4 = new Student("Семён Семёнов", 2);

		StudentManager studentManager1 = new StudentManager();
		studentManager1.addStudent(student1);
		studentManager1.addStudent(student2);
		studentManager1.addStudent(student3);
		studentManager1.addStudent(student4);

		System.out.println(studentManager1.groupingByCourse());

		studentManager1.showAllStudents();
	}
}

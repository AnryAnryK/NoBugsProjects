package org.example.answerBook.collectionsInJava.task17;

/*
17. Сортировка студентов по алфавиту
 Вводится список студентов. Отсортируй по имени.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStudentsAlphabetically {
	private final List<Student> students = new ArrayList<>();

	public void add(Student student) {
		students.add(student);
	}

	public List<Student> sorted() {
		return students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}
}

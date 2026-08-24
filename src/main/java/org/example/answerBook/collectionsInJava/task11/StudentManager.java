package org.example.answerBook.collectionsInJava.task11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentManager {
	private List<Student> studentsList = new ArrayList<>();

	public void addStudent(Student student) {
		studentsList.add(student);
	}

	public Map<Integer, List<Student>> groupingByCourse() {
		Map<Integer, List<Student>> courseMap = new TreeMap<>();

		for (Student s : studentsList) {
			int currentCourse = s.getCourse();
			courseMap.computeIfAbsent(currentCourse, k -> new ArrayList<>());
			courseMap.get(currentCourse).add(s);
		}
		return courseMap;
	}

	public void showAllStudents() {
		for (Student s : studentsList) {
			System.out.println(s);
		}
	}
}

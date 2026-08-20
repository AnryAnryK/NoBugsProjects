//package org.example.answerBook.collectionsInJava.task11;
//
///*
//11. Группировка студентов по курсам
// У каждого студента есть курс (1, 2, 3…). Нужно сгруппировать студентов по курсам.
// */
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Students {
//		private List<Integer> courseList = new ArrayList<Integer>();
//	private List<String> studentsList = new ArrayList<>();
//
//	private Map<Integer, List<String>> courseMap = new TreeMap<>();
//
//	public void addStudent(int course, String student) {
//		courseMap.put(course, student);
//	}
//
//	public Map<Integer, List<String>> groupingByCourse(){
//		return courseMap;
//	}
//
//
//	public void showAllStudents() {
//		System.out.println(courseMap);
//	}
//
//	public void addStudent(String student) {
//		studentsList.add(student);
//	}
//
//	public void addCourse(int course) {
//		courseList.add(course);
//	}
////
////	public List<String> showAllCourses() {
////		return courseList;
////	}
////
////	public List<String> showAllStudents() {
////		return studentsList;
////	}
//
////	public List<String> groupingByCourse(String student) {
////		for (String c : student) {
////			if (student.contains(c)) {
////				return c;
////			}
////
////		}
////
////	}
//}

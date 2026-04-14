package org.example.dz_3_StaticFinalModificators;

public class University {

	/*
Класс University
Создайте класс University с полями:
static String universityName — общее имя университета
final int studentID — уникальный ID
String studentName
Реализуйте конструктор для studentID и studentName, статический метод changeUniversityName(String newName),
геттер для studentName,
метод printStudentInfo() — выводит имя, ID и университет.
В main: создайте 3 студента, измените название университета и выведите данные.
	 */

	public static void main(String[] args) {
		University student1 = new University(1,"Вася");
		University student2 = new University(2,"Петя");
		University student3 = new University(3,"Катя");
		student1.printStudentInfo();
		student2.printStudentInfo();
		student3.printStudentInfo();

		System.out.println("=======================================");

		University.changeUniversityName("МГИМО");
		student1.printStudentInfo();
		student2.printStudentInfo();
		student3.printStudentInfo();
	}

	final int studentID;
	String studentName;
	static String universityName = "МГУ";


	public University(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	static void changeUniversityName(String newName) {
		universityName = newName;
	}

	void printStudentInfo() {
		System.out.println("Имя студента : " + studentName + "; ID студента : " + studentID + "; Название института студента : " + universityName);
	}
}

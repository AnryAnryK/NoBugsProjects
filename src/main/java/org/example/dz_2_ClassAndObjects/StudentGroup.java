package org.example.dz_2_ClassAndObjects;

public class StudentGroup {

	/*

	Класс StudentGroup
Создайте класс StudentGroup с полями groupName и studentCount. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
выводящий информацию о группе и количестве студентов.

В main измените число студентов и выведите информацию.
	 */

	public static void main(String[] args) {
		StudentGroup studentGroup1 = new StudentGroup("Лирики", 10);
		studentGroup1.printInfo();
		studentGroup1.setStudentCount(15);
		studentGroup1.printInfo();
	}

	private String groupName;
	private int studentCount;

	public StudentGroup(String groupName, int studentCount) {
		this.groupName = groupName;
		this.studentCount = studentCount;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public void printInfo() {
		System.out.println("Название группы студентов : " + groupName);
		System.out.println("Количество студентов в группе : " + studentCount);
	}

}

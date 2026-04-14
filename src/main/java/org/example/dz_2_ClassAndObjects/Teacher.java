package org.example.dz_2_ClassAndObjects;

public class Teacher {

	/*

	Класс Teacher
Создайте класс Teacher с полями name и subject. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
выводящий информацию о учителе и предмете.

В main измените предмет и выведите обновлённую информацию.
	 */

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Иван", "математика");
		teacher1.printInfo();
		teacher1.setSubject("информатика");
		teacher1.printInfo();
	}

	private String name;
	private String subject;

	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void printInfo() {
		System.out.println("Имя учителя : " + name);
		System.out.println("Название предмета : " + subject);
	}
}

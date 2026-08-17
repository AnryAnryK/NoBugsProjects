package org.example.answerBook.theFirstCreationOfClassesAndObjects.task15;

public class MainStudent {
	public static void main(String[] args) {
		Student student1 = new Student("Вася",2.2);
		System.out.println(student1.isHonorsStudent());
		student1.printStatus();

		Student student2 = new Student("Петя",4.6);
		System.out.println(student2.isHonorsStudent());
		student2.printStatus();

		Student student3 = new Student("Зоя", 4.5);
		System.out.println(student3.isHonorsStudent());
		student3.printStatus();
	}
}

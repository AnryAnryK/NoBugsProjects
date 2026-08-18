package org.example.answerBook.staticFinalAccessModifiers.task2;

public class MainUser {
	public static void main(String[] args) {
		new User("Петя");
		new User("Вася");
		new User("Рома");
		User.printTotalUserCount();
	}
}

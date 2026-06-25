package org.example.expressJavaTasks;

/*
Создать метод isAdult в классе Person, возвращающий true, если возраст ≥ 18.
 */

public class TwentyTwoAgeVerificationUsingAnObject {


	static class Person {
		int age;

		Person(int age) {
			this.age = age;
		}

		public static boolean isAdult(int age) {
			return age >= 18;
		}

		public static void main(String[] args) {
			System.out.println(TwentyTwoAgeVerificationUsingAnObject.Person.isAdult(18));
			System.out.println(TwentyTwoAgeVerificationUsingAnObject.Person.isAdult(19));
			System.out.println(TwentyTwoAgeVerificationUsingAnObject.Person.isAdult(17));
		}
	}
}
package org.example.answerBook.theFirstJavaProgram.task13;

/*
13. Возведение в куб
cube(int x) возвращает x * x * x.
 */

public class Cubing {

	public static int cube(int a) {
		return a * a * a;
	}

	public static void main(String[] args) {
		System.out.println(cube(4));
		System.out.println(cube(-5));
	}
}

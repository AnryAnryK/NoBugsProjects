package org.example.answerBook.theFirstJavaProgram.task7;

/*
7. Определение минимума
Метод findMin(int a, int b) — используй Math.min.
 */

public class DeterminingTheMinimum {

	public static int findMin(int a, int b) {
		return Math.min(a, b);
	}

	public static void main(String[] args) {
		System.out.println(findMin(10, 12));
	}
}

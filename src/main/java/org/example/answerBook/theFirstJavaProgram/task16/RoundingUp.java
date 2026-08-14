package org.example.answerBook.theFirstJavaProgram.task16;

/*
16. Округление вверх
roundUp(double x) — используй Math.ceil(x).
 */

public class RoundingUp {

	public static double roundUp(double a) {
		return Math.ceil(a);
	}

	public static void main(String[] args) {
		System.out.println(roundUp(122.2));
	}
}

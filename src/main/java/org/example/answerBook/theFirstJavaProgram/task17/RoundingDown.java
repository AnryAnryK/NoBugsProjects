package org.example.answerBook.theFirstJavaProgram.task17;

/*
17. Округление вниз
roundDown(double x) — используй Math.floor(x).
 */

public class RoundingDown {

	public static double roundDown(double a) {
		return Math.floor(a);
	}

	public static void main(String[] args) {
		System.out.println(roundDown(122.9));
	}
}

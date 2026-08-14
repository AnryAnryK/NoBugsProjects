package org.example.answerBook.theFirstJavaProgram.task18;

/*
18. Округление до ближайшего целого
roundNearest(double x) — используй Math.round(x).
 */

public class RoundingToTheNearestInteger {

	public static double roundNearest(double x) {
		return Math.round(x);
	}

	public static void main(String[] args) {
		System.out.println(roundNearest(122.5));
	}
}

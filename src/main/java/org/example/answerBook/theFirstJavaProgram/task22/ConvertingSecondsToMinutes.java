package org.example.answerBook.theFirstJavaProgram.task22;

/*
22. Конвертация секунд в минуты
secondsToMinutes(int seconds) возвращает seconds / 60.0.
 */

public class ConvertingSecondsToMinutes {

	public static double secondsToMinutes(int seconds) {
		return (double) seconds / 60.0;
	}

	public static void main(String[] args) {
		System.out.println(secondsToMinutes(480));
	}
}

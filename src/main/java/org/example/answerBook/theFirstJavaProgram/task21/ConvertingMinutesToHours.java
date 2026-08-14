package org.example.answerBook.theFirstJavaProgram.task21;

/*
21. Конвертация минут в часы
Метод minutesToHours(int minutes) возвращает minutes / 60.0.
 */

public class ConvertingMinutesToHours {

	public static double minutesToHours(int minutes) {
		return (double) minutes / 60;
	}

	public static void main(String[] args) {
		System.out.println(minutesToHours(488));
	}
}

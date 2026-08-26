package org.example.answerBook.conditionalStatementsAndLoopsInJava.task11;

/*
11. Проверка високосного года
 На вход подаётся год. Определи, является ли он високосным.
 */

public class LeapYear {
	public static boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
}

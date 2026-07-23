package org.example.TasksLivecode;

/*
Палиндром
+ abba
- ba
 */


public class Palindrome {

	// Вариант решения 1
	// Подсмотрел в таблице  - это вот забыл .toString()

	public static boolean isPalindrome(String string) {
		return new StringBuilder(string).reverse().toString().equals(string);
	}

	public static void main(String[] args) {
		// Вариант решения 1
		System.out.println(isPalindrome("abba"));
	}
}

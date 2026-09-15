package org.example.expressJavaTasks;

/*
Проверка палиндрома
Проверить, является ли строка палиндромом (одинаково читается в обе стороны).
 */

import java.util.Locale;

public class TwoPalindrome {
	public static void main(String[] args) {
		// Вариант 1 -> через Цикл
		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("gucci"));
		System.out.println(isPalindrome(""));
		System.out.println(isPalindrome(null));
		System.out.println("======================================");

		// Вариант 2 -> через StringBuilder
		System.out.println(isPalindrome2("abBA"));
		System.out.println(isPalindrome2("gucci"));
		System.out.println(isPalindrome2(""));
		System.out.println(isPalindrome2(null));
	}

	// Вариант 1 -> через Цикл
	public static boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	// Вариант 2 -> через StringBuilder
	public static boolean isPalindrome2(String str) {
		if (str == null) {
			return false;
		}
		String cleaned = str.toLowerCase(Locale.ROOT).replaceAll("\\s+", "");
		return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
	}
}

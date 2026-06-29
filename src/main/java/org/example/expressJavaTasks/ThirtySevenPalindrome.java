package org.example.expressJavaTasks;

/*
Проверить, является ли строка палиндромом (без учета регистра и пробелов).
 */

public class ThirtySevenPalindrome {

	public static boolean isPalindrome (String str){
		String clean = str.replaceAll("\\s+", "").toLowerCase();
		return  clean.equals(new StringBuilder(clean).reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(ThirtySevenPalindrome.isPalindrome("казак"));
		System.out.println(ThirtySevenPalindrome.isPalindrome("мошка"));
	}
}

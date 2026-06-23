package org.example.expressJavaTasks;

public class TwoCheckingThePalindrome {

	public static Boolean isPalindrome(String s) {
	String clean = s.replaceAll("\\s+", "").toLowerCase();
	return new StringBuilder(clean).reverse().toString().equals(clean);
	}

	public static void main(String[] args) {
		System.out.println("Палиндром (казак) :" + TwoCheckingThePalindrome.isPalindrome("казак"));
		System.out.println("Не Палиндром (кошка) :" + TwoCheckingThePalindrome.isPalindrome("кошка"));
	}
}

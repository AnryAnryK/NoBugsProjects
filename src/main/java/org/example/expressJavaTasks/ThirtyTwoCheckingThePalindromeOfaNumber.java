package org.example.expressJavaTasks;

/*
Проверить, является ли число палиндромом (121, 12321).
 */

public class ThirtyTwoCheckingThePalindromeOfaNumber {

	public static boolean checkingThePalindromeOfaNumber(int num) {
		int reverse = 0;
		int original = num;

		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return original == reverse;
	}

	public static void main(String[] args) {
		System.out.println(ThirtyTwoCheckingThePalindromeOfaNumber.checkingThePalindromeOfaNumber(121));
		System.out.println(ThirtyTwoCheckingThePalindromeOfaNumber.checkingThePalindromeOfaNumber(12321));
		System.out.println(ThirtyTwoCheckingThePalindromeOfaNumber.checkingThePalindromeOfaNumber(12325));
	}
}

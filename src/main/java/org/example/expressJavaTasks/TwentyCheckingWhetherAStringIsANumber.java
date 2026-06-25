package org.example.expressJavaTasks;

/*
Проверить, можно ли строку безопасно преобразовать в число.

Использовать Integer.parseInt с try-catch.
 */

public class TwentyCheckingWhetherAStringIsANumber {

	public static boolean checkingWhetherAStringIsANumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(TwentyCheckingWhetherAStringIsANumber.checkingWhetherAStringIsANumber("Один"));
		System.out.println(TwentyCheckingWhetherAStringIsANumber.checkingWhetherAStringIsANumber("1"));
		System.out.println(TwentyCheckingWhetherAStringIsANumber.checkingWhetherAStringIsANumber("1.1"));
		System.out.println(TwentyCheckingWhetherAStringIsANumber.checkingWhetherAStringIsANumber("- 1"));
		System.out.println(TwentyCheckingWhetherAStringIsANumber.checkingWhetherAStringIsANumber("1Один"));
		System.out.println(TwentyCheckingWhetherAStringIsANumber.checkingWhetherAStringIsANumber("Один1"));
		}
}

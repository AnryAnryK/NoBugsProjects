package dz_13_TrobleShooting;

/*
Задача 4:
Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
 */

public class DebugTask4 {
	public static void main(String[] args) {
		System.out.println(isPalindrome("казак"));
	}

	public static boolean isPalindrome(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
}
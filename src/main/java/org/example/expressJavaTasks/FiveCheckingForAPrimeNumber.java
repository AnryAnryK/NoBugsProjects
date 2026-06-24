package org.example.expressJavaTasks;

/*
Определить, является ли число простым (делится только на 1 и себя).
 */

public class FiveCheckingForAPrimeNumber {

	public static boolean checkingForAPrimeNumber(int num) {
		if (num <= 1) return false;

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(FiveCheckingForAPrimeNumber.checkingForAPrimeNumber(1));
		System.out.println(FiveCheckingForAPrimeNumber.checkingForAPrimeNumber(2));
		System.out.println(FiveCheckingForAPrimeNumber.checkingForAPrimeNumber(3));
		System.out.println(FiveCheckingForAPrimeNumber.checkingForAPrimeNumber(4));
		System.out.println(FiveCheckingForAPrimeNumber.checkingForAPrimeNumber(5));
	}
}

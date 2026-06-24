package org.example.expressJavaTasks;

/*
Посчитать количество гласных букв в строке.
 */

public class SevenCountingVowels {

	public static int countingVowels(String str) {
		int count = 0;
		for (char i : str.toLowerCase().toCharArray()) {
			if ("aeiouаеёиоуыэюя".indexOf(i) >= 0) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(SevenCountingVowels.countingVowels("Java"));
		System.out.println(SevenCountingVowels.countingVowels("Привет, мир !"));
	}
}

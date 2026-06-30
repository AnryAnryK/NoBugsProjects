package org.example.expressJavaTasks;

/*
Подсчитать количество гласных в строке.
 */

public class FortyThreeCountingVowels {

	public static int countingVowels(String str) {

		String vowels = "аеиоуэюя";
		int count = 0;

		for (char c : str.toLowerCase().toCharArray()) {
			if (vowels.indexOf(c) !=-1) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(FortyThreeCountingVowels.countingVowels("А я милого узнаю по походке"));
		System.out.println(FortyThreeCountingVowels.countingVowels("А"));
		System.out.println(FortyThreeCountingVowels.countingVowels(""));
	}
}

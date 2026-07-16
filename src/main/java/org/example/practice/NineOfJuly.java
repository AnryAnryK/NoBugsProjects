package org.example.practice;

/*
Есть список строк.
Нужно найти: самую длинную строку
["Лес", "Копыта", "Шизофрения", "Паять"]
 */

public class NineOfJuly {

	public static String findMaxString(String[] str) {

		int maxStringSize = str[0].length();
		String maxString = str[0];

		for (String strings : str) {
			if (maxStringSize < strings.length()) {
				maxStringSize = strings.length();
				maxString = strings;
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		System.out.println(findMaxString(new String[]{"Лес", "Копыта", "Шизофрения", "Паять"}));
	}
}

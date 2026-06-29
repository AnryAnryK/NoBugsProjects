package org.example.expressJavaTasks;

/*
Сравнить строки вида '1.2.3' и '1.10.1' по версиям.
 */

public class ThirtyOneComparingStringVersions {

	public static int comparingStringVersions(String str1, String str2) {

		String[] part1 = str1.split("\\.");
		String[] part2 = str2.split("\\.");

		int maxLenght = Math.max(part1.length, part2.length);

		for (int i = 0; i < maxLenght; i++) {
			int n1 = i < part1.length ? Integer.parseInt(part1[i]) : 0;
			int n2 = i < part2.length ? Integer.parseInt(part2[i]) : 0;

			if (n1 != n2) {
				return n1 - n2;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(ThirtyOneComparingStringVersions.comparingStringVersions("1.2.3", "1.10.1"));
		System.out.println(ThirtyOneComparingStringVersions.comparingStringVersions("1.2.3", "1.2.3"));
		System.out.println(ThirtyOneComparingStringVersions.comparingStringVersions("1.2.3", "1.2.3.4.5"));
	}
}

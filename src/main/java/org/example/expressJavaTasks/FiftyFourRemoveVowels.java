package org.example.expressJavaTasks;

/*
Удалить все гласные из строки.
 */

public class FiftyFourRemoveVowels {

	public static String removeVowels (String str){
		return str.replaceAll("(?i)[аеиоуыэюяё]", "");
	}

	public static void main(String[] args) {
		System.out.println(FiftyFourRemoveVowels.removeVowels("Как молоды мы были ё"));
	}
}

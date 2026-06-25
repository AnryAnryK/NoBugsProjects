package org.example.expressJavaTasks;

/*
Собрать строку из массива слов, разделяя пробелами.

Пройтись по массиву и собрать через StringBuilder.
 */

public class TwentyFiveStringConcatenationViaStringBuilder {

	public static String stringConcatenationViaStringBuilder(String[] strArr) {

		if (strArr == null || strArr.length == 0) {
			return "Значение массива пустое или null !";
		}

		StringBuilder newString = new StringBuilder();

		for (int i = 0; i <= strArr.length - 1; i++) {
			newString.append(" ").append(strArr[i]);

//			if (i != strArr.length - 1) newString.append(" ");  // или так - это из учебного решения !
		}
		return newString.toString();
	}

	public static void main(String[] args) {
		System.out.println(TwentyFiveStringConcatenationViaStringBuilder.stringConcatenationViaStringBuilder(new String[]{"Один", "Два", "Три"}));
		System.out.println(TwentyFiveStringConcatenationViaStringBuilder.stringConcatenationViaStringBuilder(new String[]{null}));
		System.out.println(TwentyFiveStringConcatenationViaStringBuilder.stringConcatenationViaStringBuilder(new String[]{}));
	}
}

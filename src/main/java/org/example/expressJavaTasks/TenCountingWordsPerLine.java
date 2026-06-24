package org.example.expressJavaTasks;

/*
Посчитать количество слов в строке.
 */

public class TenCountingWordsPerLine {

	public static int countingWordsPerLine(String str) {
		if (str == null || str.trim().isEmpty()) return 0;
		return str.trim().split("\\s+").length;
	}

	public static void main(String[] args) {
		System.out.println(TenCountingWordsPerLine.countingWordsPerLine("Привет, мир !"));
		System.out.println(TenCountingWordsPerLine.countingWordsPerLine(" Привет ,   ?    мир ! "));
		System.out.println(TenCountingWordsPerLine.countingWordsPerLine("     "));
		System.out.println(TenCountingWordsPerLine.countingWordsPerLine(""));
		System.out.println(TenCountingWordsPerLine.countingWordsPerLine(null));
	}
}

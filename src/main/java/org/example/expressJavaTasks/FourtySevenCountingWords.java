package org.example.expressJavaTasks;

/*
Подсчитать количество слов в строке.
 */

import java.util.Arrays;

public class FourtySevenCountingWords {

	public static int countingWords(String str) {
		return (int) Arrays.stream(str.trim()
				.split("\\s+"))
				.filter(x -> !x.isEmpty())
				.count();
	}

	public static void main(String[] args) {
		System.out.println(FourtySevenCountingWords.countingWords("Один два три четыре пять"));
		System.out.println(FourtySevenCountingWords.countingWords(""));
		System.out.println(FourtySevenCountingWords.countingWords("0"));
	}
}

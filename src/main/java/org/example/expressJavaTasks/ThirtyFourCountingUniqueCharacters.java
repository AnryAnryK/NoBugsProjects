package org.example.expressJavaTasks;

/*
Найти количество уникальных символов в строке.
 */

import java.util.HashSet;
import java.util.Set;

public class ThirtyFourCountingUniqueCharacters {

	public static long countingUniqueCharacters(String str) {

		// мой вариант
		return str.chars().distinct().count();
	}

	// учебный вариант
	public static int countingUniqueCharactersWithSet(String str) {
		Set<Character> uniqueSet = new HashSet<>();

		for (char c: str.toCharArray()){
			uniqueSet.add(c);
		}
		return uniqueSet.size();
	}

	public static void main(String[] args) {
		System.out.println("Уникальных символов: " + ThirtyFourCountingUniqueCharacters.countingUniqueCharacters("Джава"));
		System.out.println("====================================================");
		System.out.println("Уникальных символов: " + ThirtyFourCountingUniqueCharacters.countingUniqueCharactersWithSet("Джава"));
	}
}

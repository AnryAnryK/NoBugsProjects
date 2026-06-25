package org.example.expressJavaTasks;

/*
Подсчитать, сколько раз каждое слово встречается в строке.

Разбить строку и использовать Map<String, Integer>.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwentySixSearchingForTheFrequencyOfWordsInaString {

	public static Map<String, Integer> searchingForTheFrequencyOfWordsInaString(String str) {
//		int countWord = 0;

		Map<String, Integer> resultMap = new LinkedHashMap<>();

		for (String word : str.toLowerCase().replaceAll("[^а-яё]", " ").split("\\s+")) {
			resultMap.put(word, resultMap.getOrDefault(word, 0) + 1);
		}
		return  resultMap;
	}

	public static void main(String[] args) {
		System.out.println(TwentySixSearchingForTheFrequencyOfWordsInaString.searchingForTheFrequencyOfWordsInaString("Сколько нужно, столько и нужно, ё ё ё ё"));
	}
}

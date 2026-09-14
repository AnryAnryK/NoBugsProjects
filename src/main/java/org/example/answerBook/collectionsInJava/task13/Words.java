package org.example.answerBook.collectionsInJava.task13;

/*
13. Топ-3 самых частых слова в тексте
 Подсчитай частоту слов и выведи три самых частых.
 */

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Words {
	private Map<String, Integer> words = new HashMap<>();

	public int addWord(String word) {
		String key = word.toLowerCase(Locale.ROOT);
		int count = words.getOrDefault(key, 0) + 1;
		words.put(key, count);
		return count;
	}

	public void addText(String word) {
		for (String text : word.split("\\s+")) {
			if (!text.isBlank()) {
				addWord(text);
			}
		}
	}

	public void showWords() {
		for (Map.Entry<String, Integer> entry : words.entrySet())
			System.out.println(entry);
	}

	public void showTopThreeWords() {
		words.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue()
				.reversed())
				.limit(3)
				.forEach(x -> System.out.println("Слово: '" + x.getKey() + "' и Частота его встречи в тексте: '" + x.getValue() + "'"));
	}
}

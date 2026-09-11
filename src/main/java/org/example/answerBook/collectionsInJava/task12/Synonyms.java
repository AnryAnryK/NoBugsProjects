package org.example.answerBook.collectionsInJava.task12;

/*
12. Словарь синонимов
 Храни слова и список их синонимов. Обеспечь быстрый доступ по слову.
 */

import java.util.*;

public class Synonyms {
	private final Map<String, Set<String>> words = new HashMap<>();

	public void addWord(String word, List<String> synonym) {
		words.computeIfAbsent(word, k -> new LinkedHashSet<>()).addAll(synonym);
	}

	public Set<String> getSynonymsByWord(String word) {
		if (word == null || word.isBlank()) {
			return Set.of();
		}
		return words.getOrDefault(word, Set.of());
	}
}

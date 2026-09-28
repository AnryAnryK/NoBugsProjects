package org.example.answerBook.funcInterfaceLambdaStreamAPI.task8;

/*
8. Нахождение первого подходящего элемента
 Найди первую строку, начинающуюся на "A". Используй filter().findFirst().
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingFirstSuitableElement {
	private final List<String> str = new ArrayList<>();

	public boolean add(String s) {
		return str.add(s);
	}

	public Optional<String> findFirstStartingWithA() {
		return str.stream().filter(x -> x.startsWith("А")).findFirst();
	}
}

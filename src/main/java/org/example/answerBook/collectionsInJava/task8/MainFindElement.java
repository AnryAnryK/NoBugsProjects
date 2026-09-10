package org.example.answerBook.collectionsInJava.task8;

import java.util.List;

public class MainFindElement {
	public static void main(String[] args) {
		List<String> list = List.of("мама", "мыла", "раму");
		FindElement findElement = new FindElement();
		findElement.checkValue(list);
	}
}
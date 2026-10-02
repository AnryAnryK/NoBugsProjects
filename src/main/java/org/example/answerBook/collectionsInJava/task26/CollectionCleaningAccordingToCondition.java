package org.example.answerBook.collectionsInJava.task26;

/*
26. Очистка коллекции по условию
 Удаляй из списка все элементы, не удовлетворяющие заданному условию.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionCleaningAccordingToCondition {
	private List<Integer> list = new ArrayList<>();
	private Predicate<Integer> condition = x -> x % 2 == 0;

	public void addElementToList(int a) {
		list.add(a);
	}

	public void removeEvenNumbers() {
		list.removeIf(condition.negate());
	}

	public void printList() {
		System.out.println("Содержание Списка: " + list);
	}
}

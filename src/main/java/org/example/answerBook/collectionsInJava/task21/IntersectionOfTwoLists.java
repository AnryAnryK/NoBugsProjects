package org.example.answerBook.collectionsInJava.task21;

/*
21. Пересечение двух списков
 Найди общие элементы между двумя списками чисел.
 */

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLists {

	public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
		List<Integer> listOfNumbers = new ArrayList<>();

		for (Integer element : list1) {
			if (list2.contains(element)) {
				listOfNumbers.add(element);
			}
		}
		return listOfNumbers;
	}
}

package org.example.answerBook.collectionsInJava.task21;

import java.util.List;

public class MainIntersectionOfTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		List<Integer> list2 = List.of(3,4,5,6,7);
		System.out.println("Общие элементы между двумя списками чисел: " + IntersectionOfTwoLists.findIntersection(list1, list2));
	}
}

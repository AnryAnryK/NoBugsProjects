package org.example.answerBook.exceptionsAndGenerics.task5;

/*
5. Минимум из списка
 Обобщённый метод, возвращающий минимальный элемент.
 */

import java.util.List;

public class MinimumFromList {

	public static  <T extends Comparable<T>> T returnMinimumNumberFromList(List<T> lst) {
		T min = lst.get(0);

		for (int i = 1; i < lst.size(); i++) {
			T current = lst.get(i);
			if (current.compareTo(min) < 0) {
				min = current;
			}
		}
		return min;
	}
}


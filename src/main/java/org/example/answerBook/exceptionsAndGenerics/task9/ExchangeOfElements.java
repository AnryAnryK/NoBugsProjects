package org.example.answerBook.exceptionsAndGenerics.task9;

/*
9. Обмен элементов
 Метод swap() для обмена элементов списка.
 */

import java.util.List;

public class ExchangeOfElements {

	public <T> void swap(List<T> list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
}

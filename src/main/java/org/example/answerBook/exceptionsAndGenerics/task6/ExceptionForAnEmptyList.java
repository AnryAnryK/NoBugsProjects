package org.example.answerBook.exceptionsAndGenerics.task6;

/*
6. Исключение при пустом списке
 Проверка на пустоту с выбросом исключения.
 */

import java.util.ArrayList;
import java.util.List;

public class ExceptionForAnEmptyList {
	private static final List<String> list = new ArrayList<>();

	public static List<String> getList() {
		return list;
	}

	public static boolean addNonEmpty(String str) {
		if (str == null) {
			throw new IllegalArgumentException("Вносимое значение не может быть null");
		}
		if (str.isBlank()) {
			throw new IllegalArgumentException("Вносимое значение не может быть пустым");
		}
		return list.add(str);
	}
}


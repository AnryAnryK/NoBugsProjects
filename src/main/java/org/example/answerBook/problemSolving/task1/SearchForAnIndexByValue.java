package org.example.answerBook.problemSolving.task1;

/*
Задача 1: Поиск индекса по значению

Описание:
 Метод findIndex(List<String> list, String target) должен вернуть индекс первого элемента в списке, равного target.
 Если элемент не найден — вернуть -1. При выполнении метода с элементом, отсутствующим в списке, возникает исключение времени выполнения.
 */

import java.util.Arrays;
import java.util.List;

public class SearchForAnIndexByValue {


	public static int findIndex(List<String> list, String target) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<String> ls1 = Arrays.asList("Первый", "Второй", "Третий");
		System.out.println(findIndex(ls1, "Третий"));
	}
}

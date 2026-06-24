package org.example.expressJavaTasks;

/*
Посчитать сумму всех чисел в List<Integer>.
 */

import java.util.List;

public class ElevenTheSumOfTheValuesInTheList {

	public static int theSumOfTheValuesInTheList(List<Integer> lst) {

		if (lst == null) {
			throw new NullPointerException("Значение не может быть - null");
		}
		if (lst.isEmpty()) {
			throw new IllegalArgumentException("Список чисел - пустой, введите число(а)");
		}

		int sum = 0;
		for (Integer list : lst) {
			if (list == null) {
				throw new NullPointerException("Список содержит значение null !");
			}
			sum = sum + list;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(ElevenTheSumOfTheValuesInTheList.theSumOfTheValuesInTheList(List.of(1, 2, 3, 4, 5, 6)));
		System.out.println(ElevenTheSumOfTheValuesInTheList.theSumOfTheValuesInTheList(List.of()));
		System.out.println(ElevenTheSumOfTheValuesInTheList.theSumOfTheValuesInTheList(List.of(null)));
	}
}

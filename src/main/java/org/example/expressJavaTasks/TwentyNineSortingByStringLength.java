package org.example.expressJavaTasks;

/*
Отсортировать список строк по длине слов.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwentyNineSortingByStringLength {

	public static List<String> sortingByStringLength(List<String> lstStrng) {

		List<String> newSortedList = new ArrayList<>(lstStrng);

		newSortedList.sort(Comparator.comparing(String::length));
		return newSortedList;
	}

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("А");
		words.add("АБВ");
		words.add("АБВГД");
		words.add("АБ");

		System.out.println(TwentyNineSortingByStringLength.sortingByStringLength(words));
	}
}

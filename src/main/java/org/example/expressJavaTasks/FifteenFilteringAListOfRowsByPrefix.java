package org.example.expressJavaTasks;

/*
Оставить только строки, начинающиеся с 'A'.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FifteenFilteringAListOfRowsByPrefix {

	public static List<String> filteringAListOfRowsByPrefix(List<String> stringArr){

		return stringArr.stream()
				.filter(x -> x.startsWith("А"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(FifteenFilteringAListOfRowsByPrefix.filteringAListOfRowsByPrefix( List.of("Апельсин", "Банан", "Ананас")));
	}
}

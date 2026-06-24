package org.example.expressJavaTasks;

/*
Оставить в списке только нечетные числа.
 */

import java.util.ArrayList;
import java.util.List;

public class SeventeenFilteringOfOddNumbers {

	public static List<Integer> filteringOfOddNumbers(List<Integer> lst) {

		List<Integer> lstResult = new ArrayList<>();

		for (int num : lst) {
			if (num % 2 != 0)
				lstResult.add(num);
		}
		return lstResult;
	}

	public static void main(String[] args) {
		System.out.println(SeventeenFilteringOfOddNumbers.filteringOfOddNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
	}
}

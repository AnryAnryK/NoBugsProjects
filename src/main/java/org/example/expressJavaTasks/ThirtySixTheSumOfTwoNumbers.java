package org.example.expressJavaTasks;

/*
Найти два числа в массиве, сумма которых равна target, и вернуть их индексы.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThirtySixTheSumOfTwoNumbers {

	public static int[] theSumOfTwoNumbers(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (map.containsKey(complement)) {
				return new int[]{
						map.get(complement), i};
			}
			map.put(arr[i], i);
		}
		return new int[0];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ThirtySixTheSumOfTwoNumbers.theSumOfTwoNumbers(new int[]{1, 2, 3, 4}, 7)));
	}
}

package org.example.practice.toPointersPattern;

import java.util.Arrays;

public class ToPointersPattern {

	public static int[] twoIndex(int[] array, int target) {
		int first = 0;
		int last = array.length - 1;

		while (first < last) {
			int sum = array[first] + array[last];
			if (sum == target)
				return new int[]{first, last};

			if (sum < target) {
				first++;
			} else {
				last--;
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		int[] arr1 = new int[]{1, 2, 4, 6, 15, 22};
		System.out.println(Arrays.toString(twoIndex(arr1, 21)));
	}
}

package org.example.expressJavaTasks;

/*
Подсчитать количество положительных чисел.
 */

public class FortyEightPositiveNumbers {

	public static int positiveNumbers(int[] num) {

		int count = 0;

		for (int numbers : num) {
			if (numbers > 0) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(FortyEightPositiveNumbers.positiveNumbers(new int[]{-1, -2, 3, 4}));
		System.out.println(FortyEightPositiveNumbers.positiveNumbers(new int[]{1, 2, 3, 4}));
		System.out.println(FortyEightPositiveNumbers.positiveNumbers(new int[]{-1, -2, -3, -4}));
	}
}

package org.example.expressJavaTasks;

/*
Подсчитать четные и нечетные числа.
 */

import java.util.Arrays;

public class FiftyTwoEvenAndOddNumbers {

	public static int[] evenAndOddNumbers(int[] num) {

		int sumOfEvenNumbers = 0;
		int sumOfOddNumbers = 0;

		for (int n : num) {
			if (n % 2 == 0)
				sumOfEvenNumbers++;
			else sumOfOddNumbers++;
		}
		return new int[]{sumOfEvenNumbers, sumOfOddNumbers};
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(FiftyTwoEvenAndOddNumbers.evenAndOddNumbers(new int[]{1, 2, 3, 4, 5, 6})));
		System.out.println(Arrays.toString(FiftyTwoEvenAndOddNumbers.evenAndOddNumbers(new int[]{1, 3, 5})));
		System.out.println(Arrays.toString(FiftyTwoEvenAndOddNumbers.evenAndOddNumbers(new int[]{2, 4, 6})));
	}
}

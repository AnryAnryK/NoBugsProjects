package org.example.expressJavaTasks;

/*
Посчитать сумму всех чисел в массиве.
 */

public class ThreeTheSumOfTheArrayNumbers {

	public static int sumOfTheArrayNumbers(int[] arr) {
		int count = 0;
		for (int array : arr) {
			count = count + array;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Сумма чисел в массиве = " + ThreeTheSumOfTheArrayNumbers.sumOfTheArrayNumbers(new int[]{1, 2, 3, 4, 5}));
	}
}

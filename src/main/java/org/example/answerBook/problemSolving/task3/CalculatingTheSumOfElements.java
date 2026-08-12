package org.example.answerBook.problemSolving.task3;

/*
Задача 3: Подсчёт суммы элементов

Описание:
 Метод sum(int[] nums) должен возвращать сумму всех элементов массива. При отладке видно, что один из элементов не включается в сумму.
 */

public class CalculatingTheSumOfElements {

	public static int sum(int[] nums) {
		int totalSumm = 0;

		for (int i = 0; i < nums.length; i++) {
			totalSumm = totalSumm + nums[i];
		}
		return totalSumm;
	}

	public static void main(String[] args) {
		System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6}));
	}
}

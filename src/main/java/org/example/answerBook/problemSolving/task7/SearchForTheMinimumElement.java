package org.example.answerBook.problemSolving.task7;

/*
Задача 7: Поиск минимального элемента

Описание:
 Метод min(int[] nums) должен находить минимальное значение в массиве.
 В дебаге видно, что инициализация происходит с нуля, что не работает с отрицательными значениями.
 */

public class SearchForTheMinimumElement {

	public static int min(int[] nums) {

		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("Код не работает с пустыми массивами !");
		}
		int minNumber = nums[0];
		for (int num : nums) {
			if (num < minNumber) {
				minNumber = num;
			}
		}
		return minNumber;
	}

	public static void main(String[] args) {
		System.out.println(min(new int[]{2, 4, 1, 5}));
		System.out.println(min(new int[]{}));
	}
}

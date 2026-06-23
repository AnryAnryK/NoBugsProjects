package org.example.expressJavaTasks;

public class EightFindingTheSecondMaximumElement {

	public static int findingTheSecondMaximumElement(int[] arr) {
		int firstMaxElement = Integer.MIN_VALUE;
		int secondMaxElement = Integer.MIN_VALUE;

		for (int i : arr) {
			if (i > firstMaxElement) {
				secondMaxElement = firstMaxElement;
				firstMaxElement = i;
			} else if (i > secondMaxElement && i != firstMaxElement) {
				secondMaxElement = i;
			}
		}
		return secondMaxElement;
	}

	public static void main(String[] args) {
		System.out.println(EightFindingTheSecondMaximumElement.findingTheSecondMaximumElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}
}

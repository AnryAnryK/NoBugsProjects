package org.example.answerBook.multithreading.task5;

import java.util.Arrays;

public class MainParallelSortingOfArrayParts {
	public static void main(String[] args) throws InterruptedException {
		ParallelSortingOfArrayParts parallelSortingOfArrayParts = new ParallelSortingOfArrayParts();
		int[] result = parallelSortingOfArrayParts.sort();
		System.out.println(Arrays.toString(result));
	}
}


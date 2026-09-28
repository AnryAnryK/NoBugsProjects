package org.example.answerBook.multithreading.task5;

/*
5. Параллельная сортировка частей массива
 Раздели массив из 1000 случайных чисел на 4 части и отсортируй каждую часть в отдельном потоке. После завершения объедини части в один отсортированный массив.
 */

import java.util.Arrays;
import java.util.Random;

public class ParallelSortingOfArrayParts {

	public int[] sort() throws InterruptedException {
		int[] arr = new int[1000];
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			arr[i] = random.nextInt(1000);
		}

		Thread thread0 = new Thread(() -> Arrays.sort(arr, 0, 250));
		Thread thread1 = new Thread(() -> Arrays.sort(arr, 250, 500));
		Thread thread2 = new Thread(() -> Arrays.sort(arr, 500, 750));
		Thread thread3 = new Thread(() -> Arrays.sort(arr, 750, 1000));

		thread0.start();
		thread1.start();
		thread2.start();
		thread3.start();

		thread0.join();
		thread1.join();
		thread2.join();
		thread3.join();

		Arrays.sort(arr);
		return arr;
	}
}

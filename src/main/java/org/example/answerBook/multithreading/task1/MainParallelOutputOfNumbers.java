package org.example.answerBook.multithreading.task1;

import static org.example.answerBook.multithreading.task1.ParallelOutputOfNumbers.createEvenNumbersThread;
import static org.example.answerBook.multithreading.task1.ParallelOutputOfNumbers.createOddNumbersThread;

public class MainParallelOutputOfNumbers {
	public static void main(String[] args) throws InterruptedException {

		Thread even = createEvenNumbersThread();
		Thread odd = createOddNumbersThread();

		even.start();
		odd.start();

		even.join();
		odd.join();
	}
}

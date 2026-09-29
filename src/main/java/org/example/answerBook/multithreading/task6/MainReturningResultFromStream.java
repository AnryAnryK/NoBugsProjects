package org.example.answerBook.multithreading.task6;

import java.util.concurrent.ExecutionException;

public class MainReturningResultFromStream {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ReturningResultFromStream returningResultFromStream = new ReturningResultFromStream();
		System.out.println("Квадрат числа: " + returningResultFromStream.calculateSquare(2));
		System.out.println("Квадрат числа: " + returningResultFromStream.calculateSquare(3));
	}
}

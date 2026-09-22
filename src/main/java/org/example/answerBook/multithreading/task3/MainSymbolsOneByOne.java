package org.example.answerBook.multithreading.task3;

public class MainSymbolsOneByOne {
	public static void main(String[] args) throws InterruptedException {
		SymbolsOneByOne symbolsOneByOne = new SymbolsOneByOne();

		Runnable taskA = () -> {
			try {
				symbolsOneByOne.printA();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		Runnable taskB = () -> {
			try {
				symbolsOneByOne.printB();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};

		Thread threadA = new Thread(taskA);
		Thread threadB = new Thread(taskB);
		threadA.start();
		threadB.start();

		threadA.join();
		threadB.join();
		System.out.println();

		String expectedResult = "ABABABABABABABABABAB";
		String actualResult = symbolsOneByOne.result;

		if (!actualResult.equals(expectedResult)) {
			throw new AssertionError("Результат не соответствует ожидаемому");
		}
	}
}

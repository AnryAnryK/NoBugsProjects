package org.example.dz_11_Multithreading;

public class Task6Main {

	static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public synchronized static int halfSum(int[] arraylist1) throws InterruptedException {
		int falfSum1 = arraylist1.length / 3;
		int falfSum2 = arraylist1.length / 3 * 2;
		int falfSum3 = arraylist1.length;

		Task6 threadFirst = new Task6(arraylist1, 0, falfSum1);
		Task6 threadSecond = new Task6(arraylist1, falfSum1, falfSum2);
		Task6 threadThird = new Task6(arraylist1, falfSum2, falfSum3);

		Thread threadFirst1 = new Thread(threadFirst);
		threadFirst1.start();
		System.out.println("Название Потока 1: " + threadFirst1.getName());

		Thread threadSecond2 = new Thread(threadSecond);
		threadSecond2.start();
		System.out.println("Название Потока 2: " + threadSecond2.getName());

		Thread threadThird3 = new Thread(threadThird);
		threadThird3.start();
		System.out.println("Название Потока 3: " + threadThird3.getName());

		threadFirst1.join();
		threadSecond2.join();
		threadThird3.join();

		int totalSum = threadFirst.getSum() + threadSecond.getSum() + threadThird.getSum();
		return totalSum;
	}

	public static void main(String[] args) throws InterruptedException {
		int totalSum = halfSum(array);
		int countAllТumbers = array.length;
		System.out.println("Общая сумма цифр во всех потоках: " + totalSum);
		System.out.println("Общее количество элементов, обработанных во всех потоках: " + countAllТumbers);
	}
}

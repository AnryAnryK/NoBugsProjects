package org.example.dz_11_Multithreading.Task7;

public class Task7_Main {
	/*
	7. Реализация блокировки с использованием ReentrantLock
Условие задачи:
Напишите программу, которая моделирует работу банковского счета с несколькими потоками. Каждый поток должен попытаться перевести деньги с одного счета на другой.
Для обеспечения правильной работы программы используйте ReentrantLock для синхронизации работы с двумя счетами.
	 */


	public static void main(String[] args) throws InterruptedException {

		Task7_Account task7Account = new Task7_Account(10);
		Task7_Account task7Account2 = new Task7_Account( 9);

		Thread thread1 = new Thread(new Task7_Transaction(task7Account, task7Account2, 2));
		Thread thread2 = new Thread(new Task7_Transaction(task7Account2, task7Account, 1));

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		}
}





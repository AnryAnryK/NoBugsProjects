//package org.example.dz_11_Multithreading;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Task6v2 implements Runnable {
//	/*
//6. Параллельная обработка данных с использованием потоков
//Условие задачи:
//Напишите программу, которая создает 3 потока для обработки элементов в списке. Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
//После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.
//	 */
//
//
//	/*
//	НЕ СДЕЛАЛ !  Не понимаю как разбить Лист на равных три части
//	 */
//
//
//		public static void main(String[] args) throws InterruptedException {
//		ExecutorService es1 = Executors.newFixedThreadPool(3);
//			int[] arraylist1;
//			int indexBegin;
//			int indexFinish;
//			int count = 0;
//
//		Runnable thread1 = () -> {
//			for (int i = indexBegin; i < indexFinish - 6; i++) {
//				count = count + count;
//				System.out.println("Поток 1: " + list1.indexOf(1) + "; " + Thread.currentThread().getName());
//			}
//		};
//
//
//		Runnable thread2 = () -> {
//			for (int i = indexFinish - 5; i < indexFinish - 3; i++) {
//				System.out.println("Поток 2: " + list1.size() + "; " + Thread.currentThread().getName());
//			}
//		};
//
//
//		Runnable thread3 = () -> {
//			for (int i = indexFinish - 2; i <= indexFinish; i++) {
//				System.out.println("Поток 3: " + list1.size() + "; " + Thread.currentThread().getName());
//			}
//		};
//
//		Thread threadFirst = new Thread(thread1);
//		threadFirst.start();
//
//		Thread threadSecond = new Thread(thread2);
//		threadSecond.start();
//
//		Thread threadThird = new Thread(thread3);
//		threadThird.start();
//
//		threadFirst.join();
//		threadSecond.join();
//		threadThird.join();
//
//	}
//}

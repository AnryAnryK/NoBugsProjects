package org.example.dz_11_Multithreading;

import java.util.Arrays;
import java.util.List;

public class Task6 implements Runnable {
	/*
6. Параллельная обработка данных с использованием потоков
Условие задачи:
Напишите программу, которая создает 3 потока для обработки элементов в списке. Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.
	 */


	/*
	НЕ СДЕЛАЛ !  Не понимаю как разбить Лист на равных три части
	 */

	int[] arraylist1;
	int indexBegin;
	int indexFinish;

	int sum = 0;
	int count = 0;

	public int getSum() {
		return this.sum;
	}

	public int getCount() {
		return this.count;
	}

	@Override
	public void run(){
		for (int i = indexBegin; i < indexFinish; i++) {
			count = count + arraylist1[i];
			sum = sum++;
			System.out.println("Индекс: " + i + "; Значение индекса: " + count);
		}
	}

	public Task6(int[] arraylist1, int indexBegin, int indexFinish) {
		this.arraylist1 = arraylist1;
		this.indexBegin = indexBegin;
		this.indexFinish = indexFinish;
	}
}

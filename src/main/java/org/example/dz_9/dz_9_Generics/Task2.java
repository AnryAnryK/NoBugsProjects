package org.example.dz_9.dz_9_Generics;

public class Task2 {

	/*
	2. Задача на дженерик метод
Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
	 */

	Integer[] int1 = {1, 2, 3};
	String[] string1 = {"Один", "Два", "Три"};

	public <T> void printArray(T [] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Task2 task2Ints = new Task2();
		task2Ints.printArray(task2Ints.int1);

		Task2 task2Strings = new Task2();
		task2Ints.printArray(task2Strings.string1);
	}
}

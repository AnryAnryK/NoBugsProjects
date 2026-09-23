package org.example.answerBook.exceptionsAndGenerics.task2;

/*
2. Печать любого списка
 Метод, выводящий элементы списка произвольного типа.
 */

import java.util.Arrays;
import java.util.List;

public class Printer<T> {
	private List<T> elements;

	public Printer(List<T> elements) {
		this.elements = elements;
	}

	public static void main(String[] args) {
		Printer<String> printerString = new Printer<>(List.of("Сентябрь", "Октябрь", "Ноябрь", "Декабрь"));
		printerString.printElements();

		Printer<Integer> printerInteger = new Printer<>(Arrays.asList(9, 10, 11, 12));
		printerInteger.printElements();
	}

	public void printElements() {
		elements.forEach(System.out::println);
	}
}

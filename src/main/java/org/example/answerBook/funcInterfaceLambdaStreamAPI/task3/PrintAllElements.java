package org.example.answerBook.funcInterfaceLambdaStreamAPI.task3;

/*
Печать всех элементов с Consumer
 Пройдись по списку и выведи каждый элемент, используя Consumer и forEach().
 */

import java.util.List;

public class PrintAllElements {
	public static void main(String[] args) {
		List<String> str = List.of("Завтрак", "Обед", "Ужин");
		printElements(str);
	}

	public static void printElements(List<String> str) {
		str.stream().forEach(x -> System.out.println(x));
	}
}

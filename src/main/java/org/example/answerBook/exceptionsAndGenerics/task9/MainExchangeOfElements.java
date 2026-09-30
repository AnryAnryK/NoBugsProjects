package org.example.answerBook.exceptionsAndGenerics.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainExchangeOfElements {
	public static void main(String[] args) {
		ExchangeOfElements exchangeOfElements = new ExchangeOfElements();
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
		System.out.println("Список до обмена: " + list);
		exchangeOfElements.swap(list, 0, 2);
		System.out.println("Список после обмена: " + list);
	}
}

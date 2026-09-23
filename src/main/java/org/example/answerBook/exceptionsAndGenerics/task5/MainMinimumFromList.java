package org.example.answerBook.exceptionsAndGenerics.task5;

import java.util.List;

import static org.example.answerBook.exceptionsAndGenerics.task5.MinimumFromList.returnMinimumNumberFromList;

public class MainMinimumFromList {
	public static void main(String[] args) {
		System.out.println(returnMinimumNumberFromList(List.of(1, 2, 3, 4, 5, 6, 7)));
		System.out.println(returnMinimumNumberFromList(List.of(1, 1,1,1)));
		System.out.println(returnMinimumNumberFromList(List.of("Яблоко", "Груша")));
	}
}

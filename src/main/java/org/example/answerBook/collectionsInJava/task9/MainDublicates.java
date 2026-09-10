package org.example.answerBook.collectionsInJava.task9;

import java.util.ArrayList;
import java.util.List;

public class MainDublicates {
	public static void main(String[] args) {
		Dublicates dublicates = new Dublicates();
		List<Integer> numbers = new ArrayList<>(List.of(1,2,3));
		dublicates.deleteDublicates(numbers);
	}
}

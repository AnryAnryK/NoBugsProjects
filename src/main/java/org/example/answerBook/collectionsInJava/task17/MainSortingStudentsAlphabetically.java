package org.example.answerBook.collectionsInJava.task17;

import java.util.List;

public class MainSortingStudentsAlphabetically {
	public static void main(String[] args) {
		SortingStudentsAlphabetically sortingStudentsAlphabetically = new SortingStudentsAlphabetically();
		sortingStudentsAlphabetically.add(new Student("Яна"));
		sortingStudentsAlphabetically.add(new Student("Вася"));
		sortingStudentsAlphabetically.add(new Student("Петя"));
		sortingStudentsAlphabetically.add(new Student("Гриша"));

		System.out.println(sortingStudentsAlphabetically.sorted());
	}
}

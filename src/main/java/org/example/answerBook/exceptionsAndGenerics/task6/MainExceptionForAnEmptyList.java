package org.example.answerBook.exceptionsAndGenerics.task6;


public class MainExceptionForAnEmptyList {
	public static void main(String[] args) {

		String list1 = "Один";
		String list2 = "Два";
		String list3 = "";
		String listNull = null;

		try {
			ExceptionForAnEmptyList.addNonEmpty(list1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			ExceptionForAnEmptyList.addNonEmpty(list2);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			ExceptionForAnEmptyList.addNonEmpty(list3);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			ExceptionForAnEmptyList.addNonEmpty(listNull);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("В Список попали следующие значения: " + ExceptionForAnEmptyList.getList());
	}
}

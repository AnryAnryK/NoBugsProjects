package org.example.expressJavaTasks;

/*
Удалить все пробелы из строки.
 */

public class FiftyRemoveSpaces {

	public static String removeSpaces(String str){

		return str.replaceAll("\\s+", "");
	}

	public static void main(String[] args) {
		System.out.println(FiftyRemoveSpaces.removeSpaces("Раз Два Три Четыре"));
	}
}

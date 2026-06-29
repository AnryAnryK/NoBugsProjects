package org.example.expressJavaTasks;

/*
Удалить все пробелы из строки, включая в начале, в середине и в конце.
 */

public class ThirtyFiveRemovingAllSpacesFromaString {

	public static String removingAllSpacesFromaString (String str){
		return str.replaceAll("\\s+","");
	}

	public static void main(String[] args) {
		System.out.println(ThirtyFiveRemovingAllSpacesFromaString.removingAllSpacesFromaString(" Добрый день ага ага ! "));
	}
}

package org.example.expressJavaTasks;

/*
Объединить два списка в один.

Создать новый список и добавить все элементы.
 */

import java.util.ArrayList;
import java.util.List;

public class TwentyOneMergingTwolists {

	public static List<String> mergingTwolists(List<String> lst1, List<String> lst2){
		List<String> newList = new ArrayList<>(lst1);
		newList.addAll(lst2);
		return newList;
	}

	public static void main(String[] args) {
		System.out.println(TwentyOneMergingTwolists.mergingTwolists(List.of("J", "a"), List.of("v", "a")));
	}
}

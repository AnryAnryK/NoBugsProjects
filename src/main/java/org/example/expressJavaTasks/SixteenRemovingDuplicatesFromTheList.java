package org.example.expressJavaTasks;

/*
Удалить дубликаты из List<Integer>.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SixteenRemovingDuplicatesFromTheList {

	public static List<Integer> removingDuplicatesFromTheList(List<Integer> lst){

		Set<Integer> actualList = new HashSet<>(lst);
		return new ArrayList<>(actualList);

//		return new ArrayList<> (new HashSet<>(lst));  // или так коротко
	}

	public static void main(String[] args) {
		System.out.println(SixteenRemovingDuplicatesFromTheList.removingDuplicatesFromTheList(List.of(1,2,2,3,4,4,5)));
	}
}

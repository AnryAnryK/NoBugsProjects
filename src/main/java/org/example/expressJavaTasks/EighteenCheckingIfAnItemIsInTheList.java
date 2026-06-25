package org.example.expressJavaTasks;

/*
Проверить, содержит ли список заданное число.
 */

import java.util.List;

public class EighteenCheckingIfAnItemIsInTheList {

	public static boolean checkingIfAnItemIsInTheList(List<Integer> lst, int number){
		return lst.contains(number);
	}

	public static void main(String[] args) {
		System.out.println(EighteenCheckingIfAnItemIsInTheList.checkingIfAnItemIsInTheList(List.of(1,2,3,4,5), 5));
		System.out.println(EighteenCheckingIfAnItemIsInTheList.checkingIfAnItemIsInTheList(List.of(1,2,3,4,5), 7));
	}
}

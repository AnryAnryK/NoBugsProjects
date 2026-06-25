package org.example.expressJavaTasks;

/*
Вернуть true, если число чётное.
 */

public class TwentyThreeCheckingTheParityOfANumber {

	public static boolean checkingTheParityOfANumber(int a){

		return a % 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(TwentyThreeCheckingTheParityOfANumber.checkingTheParityOfANumber(16));
		System.out.println(TwentyThreeCheckingTheParityOfANumber.checkingTheParityOfANumber(17));
	}
}

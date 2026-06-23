package org.example.expressJavaTasks;

import java.util.Random;

public class ThirtyThreeGenerationRandomNumber {

	public static int getRandom(){
		return new Random().nextInt(10) + 1;
	}

	public static void main(String[] args) {
		System.out.println("Значение Генератора случайных чисел = " + ThirtyThreeGenerationRandomNumber.getRandom());
	}
}

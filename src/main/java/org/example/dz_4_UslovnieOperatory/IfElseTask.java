package org.example.dz_4_UslovnieOperatory;

import java.util.Scanner;

public class IfElseTask {


	public static void main(String[] args) {

		IfElseTask ifElseTask = new IfElseTask();

//	 //	      Задача 1
//	    ifElseTask.checkInt();
//
//		  //    Задача 2
		ifElseTask.maxInt();
//
//			//	Задача 3
//		ifElseTask.printTextMark();
//
//		  //    Задача 4
//		ifElseTask.checkParity();
//
//		   //   Задача 5
//		ifElseTask.checkDiscount();
//
//
//		//      Задача 6
//		ifElseTask.evaluationTestResult();
	}


	// Задача 1

	public void checkInt() {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		System.out.println("Введено : " + number);

		if (number > 0) {
			System.out.println("Число положительное");
		} else if (number < 0) {
			System.out.println("Число отрицательное");
		} else
			System.out.println("Число равно нулю");
	}


	// Задача 2

	public void maxInt() {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b) {
			System.out.println(a + " (вариант: a) - наибольшее число");
		} else if (b > a) {
			System.out.println(b + " (вариант: b) - наибольшее число");
		}
	}


	//Задача 3

	public void printTextMark() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите оценку от 1 до 5 : ");
		int mark = scanner.nextInt();

		switch (mark) {
			case 5:
				System.out.println("Отлично");
				break;

			case 4:
				System.out.println("Хорошо");
				break;

			case 3:
				System.out.println("Удовлетворительно");
				break;

			case 2:
			case 1:
				System.out.println("Неудовлетворительно");
				break;

			default:
				System.out.println("Неверное значение, Диапазон ввода только от 1 до 5");
				break;
		}
	}


//      Задача 4

	public void checkParity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число : ");

		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Число чётное");
		} else System.out.println("Число нечётное");
	}


	//      Задача 5

	public void checkDiscount() {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();

		if (year < 18) {
			System.out.println("discount = 25%");
		} else if (year >= 65) {
			System.out.println("discount = 30%");
		} else System.out.println("Без скидки");
	}


	//      Задача 6

	public void evaluationTestResult() {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number >= 90) {
			System.out.println("Отлично");
		} else if (number >= 75 && number <= 89) {
			System.out.println("Хорошо");
		} else if (number >=60 && number <=74){
			System.out.println("Удовлетворительно");
		} else if (number <60){
			System.out.println("Неудовлетворительно");
		}
	}
}

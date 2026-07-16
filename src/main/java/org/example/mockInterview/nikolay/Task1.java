package org.example.mockInterview.nikolay;

/*
Дано:
На вход дана Строка из чисел "456"
Найти:
сумму всех цифр в Строке
 */

public class Task1 {

	String numbers = "456";


	public static int sumOfNumbers(String num) throws NumberFormatException {
		int sum = 0;
		for (char element : num.toCharArray()) {
			try {
				sum = sum + Integer.parseInt(String.valueOf(element));
			} catch (NumberFormatException n){
//				throw new NumberFormatException("Для исполнения операции сложения в строке не должно быть символов !");  // или так
				return 0;  // или так
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfNumbers("456"));
		System.out.println(sumOfNumbers("456а"));
	}
}

package org.example.dz_9.dz_Exceptions;

public class Task2 {

	/*
	2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
	 */

	int a;
	int b;

	public Integer division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args)  {
		try {
			Task2 task2 = new Task2();
			task2.division(1, 0);
		} catch (Exception e) {
			System.out.println("Деление на 0 запрещено ! ");
		}
	}
}

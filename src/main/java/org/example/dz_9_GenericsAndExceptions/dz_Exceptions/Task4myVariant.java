package org.example.dz_9_GenericsAndExceptions.dz_Exceptions;

public class Task4myVariant {

	/*
	4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом.
Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
	 */
	static String etalonEmail = "https://nobugs.me/";
	static String email = "https://nobugs.me111/";


	public void checkCorrectEmai(String email) throws IncorrectEmailExceptionMyVariant {
		if (email != etalonEmail) {
			throw new IncorrectEmailExceptionMyVariant(email + " - не соответствует эталону: " + etalonEmail);
		}
	}

	public static void main(String[] args) {
		try{ Task4myVariant task4MyVariant = new Task4myVariant();
		task4MyVariant.checkCorrectEmai(email);
		}
		catch (IncorrectEmailExceptionMyVariant e) {
			System.out.println(e.getMessage());
		}
	}
}


class IncorrectEmailExceptionMyVariant extends RuntimeException {
	public IncorrectEmailExceptionMyVariant(String email) {
		super(email);
	}
}

package org.example.dz_9.dz_Exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	/*
	4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом.
Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
	 */

	//не понимаю решения по этой задаче, указанному в Разбор_ДЗ_Дженерики_и_исключения_, поэтому сделал свой вариант - см. класс Task4myVariant

	public static void validateEmail(String email) {
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; // не понимаю что это
		Pattern pattern = Pattern.compile(regex); // не понимаю что это
		Matcher matcher = pattern.matcher(email); // не понимаю что это

		if (!matcher.matches()) { // не понимаю что это
			throw new IncorrectEmailException("Неверный формат email: " + email);
		}
		System.out.println("Email валиден: " + email);
	}

	public static void main(String[] args) {
		try {
			validateEmail("invalidemail.com"); // не понимаю - почему и чем этот email НЕ валиден !
		} catch (IncorrectEmailException e) {
			System.out.println(e.getMessage());
		}
	}
}

	class IncorrectEmailException extends RuntimeException {
		public IncorrectEmailException(String email) {
			super(email);
		}
	}




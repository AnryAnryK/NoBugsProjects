package org.example.dz_9_GenericsAndExceptions.dz_Exceptions;

public class Task3 {

	/*
	3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
	 */
	//int age;

	public void checkValidAge(int age) throws CheckValidAgeException {
		if (age < 0 || age > 150) {
			throw new CheckValidAgeException("Возраст: " + age + " - не валиден ! ");
		}
	}


	public static void main(String[] args) {
		try {
			Task3 task3 = new Task3();
			task3.checkValidAge(160);
		} catch (CheckValidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}


class CheckValidAgeException extends Exception {
	public CheckValidAgeException(String text) {
		super(text);
	}
}

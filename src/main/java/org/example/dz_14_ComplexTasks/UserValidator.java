package org.example.dz_14_ComplexTasks;

public class UserValidator extends Exception {
	User user1 = new User("Петя", 18, "petya@mail.com");
	boolean validationEnabled = true;

	public void checkUserName(String name) {

		if (name != null && name.startsWith("[A-Z]\\w*") && validationEnabled)
			try {
				user1.getName();
			} catch (Exception InvalidUserException) {
				System.out.println("Имя пользователя не соответствует требованиям: " + InvalidUserException);
			}
	}

	public void checkUserAge(int age) {

		if (age < 18 && age > 100 && validationEnabled)
			try {
				user1.getAge();
			} catch (Exception InvalidUserException) {
				System.out.println("Возраст пользователя не соответствует требованиям: " + InvalidUserException);
			}
	}

	public void checkUserEmail(String email) {

		if (email.equals("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@\" +\n\"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$") && validationEnabled)
			try {
				user1.getEmail();
			} catch (Exception InvalidUserException) {
				System.out.println("Электронная почта пользователя не соответствует требованиям: " + InvalidUserException);
			}
	}
}

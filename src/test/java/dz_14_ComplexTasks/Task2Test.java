package dz_14_ComplexTasks;

import org.example.dz_14_ComplexTasks.User;
import org.example.dz_14_ComplexTasks.UserValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task2Test {

	@Test
	@DisplayName("Позитивные тесты: проверка корректности Имени Пользователя")
	public void testValidNamePositiveTests(){
		User user1 = new User("Петя", 180, "petya@mail.com");
		UserValidator userValidator1 = new UserValidator();
//		user1.getName();
//		user1.getAge();
//		user1.getEmail();

		userValidator1.checkUserName(user1.getName());
		userValidator1.checkUserAge(user1.getAge());
		userValidator1.checkUserEmail(user1.getEmail());
	}
}

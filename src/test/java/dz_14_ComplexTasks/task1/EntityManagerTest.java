package dz_14_ComplexTasks.task1;

import org.example.dz_14_ComplexTasks.task1.EntityManager;
import org.example.dz_14_ComplexTasks.task1.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class EntityManagerTest {

	EntityManager<User> entityManager1 = new EntityManager<>();

	List<User> allUsersList;

	@Test
	@DisplayName("Позитивные тесты: добавление User")
	public void addUserPositiveTests() {
		User user1 = new User(25, "Петя", true);
		User actualAddUser1 = entityManager1.addUser(user1);
		assertSame(user1, actualAddUser1);

		allUsersList = entityManager1.getAllUsers();
		System.out.println("Пользователь: " + user1.getName() + ", " + user1.getAge() + " - добавлен");
	}
}

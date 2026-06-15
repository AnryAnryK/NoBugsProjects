package dz_14_ComplexTasks.task1;

import org.example.dz_14_ComplexTasks.task1.EntityManager;
import org.example.dz_14_ComplexTasks.task1.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {

	EntityManager<User> entityManager1 = new EntityManager<>();
	List<User> allUsersList;

	@Test
	@DisplayName("Позитивные тесты: добавление User")
	public void addUserPositiveTests() {
		User user1 = new User(25, "Петя", true);
		User actualAddUser1 = entityManager1.addUser(user1);
		allUsersList = entityManager1.getAllUsers();
		assertTrue(allUsersList.contains(user1));
		assertSame(user1, actualAddUser1);
	}

	@Test
	@DisplayName("Позитивные тесты: удаление User")
	public void removeUserPositiveTests() {
		User user1 = new User(25, "Петя", true);
		User actualAddUser1 = entityManager1.addUser(user1);
		assertSame(user1, actualAddUser1);

		boolean actualRemovedUser = entityManager1.removeUser(user1);
		allUsersList = entityManager1.getAllUsers();
		assertTrue(actualRemovedUser);
		assertFalse(entityManager1.getAllUsers().contains(user1));
	}

	@Test
	@DisplayName("Позитивные тесты: получения списка User в заданном возрастном диапазоне ")
	public void getUserByAgeFilterPositiveTests() {
		int minAge = 18;
		int maxAge = 60;

		User user1 = new User(25, "Петя", true);
		entityManager1.addUser(user1);
		entityManager1.filterByIsActive(true);

		User user2 = new User(17, "Вася", true);
		entityManager1.addUser(user2);
		entityManager1.filterByIsActive(true);

		allUsersList = entityManager1.filterByAge(minAge, maxAge);
		assertEquals(2, allUsersList.size());
		assertEquals("Петя", allUsersList.get(0).getName());
		assertNotEquals("Вася", allUsersList.get(0).getName());
	}

	@Test
	@DisplayName("Позитивные тесты: получения списка User, чьи имена соответствуют заданной строке")
	public void getUserByNameFilterPositiveTests() {
		User user1 = new User(25, "Петя", true);
		entityManager1.addUser(user1);

		User user2 = new User(17, "Вася", true);
		entityManager1.addUser(user2);

		List<User> actualUsersResultFilterByName = entityManager1.filterByName("Вася");
		assertEquals(1, actualUsersResultFilterByName.size());
	}

	@Test
	@DisplayName("Позитивные тесты: получения списка User со статусом активности - true")
	public void getUserByFilterIsActivePositiveTests() {
		User user1 = new User(25, "Петя", true);
		entityManager1.addUser(user1);

		User user2 = new User(17, "Вася", false);
		entityManager1.addUser(user2);

		User user3 = new User(35, "Дима", false);
		entityManager1.addUser(user3);

		List<User> allActiveUsersList = entityManager1.filterByIsActive(true);
		List<User> allNotActiveUsersList = entityManager1.filterByIsActive(false);

		assertEquals(1, allActiveUsersList.size());
		assertEquals("Петя", allActiveUsersList.get(0).getName());
		assertEquals("Вася", allNotActiveUsersList.get(0).getName());
		assertEquals("Дима", allNotActiveUsersList.get(1).getName());

	}
}

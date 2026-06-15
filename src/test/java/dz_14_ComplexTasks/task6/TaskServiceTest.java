package dz_14_ComplexTasks.task6;

import org.example.dz_14_ComplexTasks.task5.OutOfStockException;
import org.example.dz_14_ComplexTasks.task6.Task;
import org.example.dz_14_ComplexTasks.task6.TaskService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
	TaskService taskService1 = new TaskService();
	List<Task> tasks;

	@Test
	@DisplayName("Позитивные тесты: добавление новой Task")
	public void addNewTaskPositiveTests() throws OutOfStockException {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);
		tasks = taskService1.findTaskByStatus("in Progress");
		assertEquals(1, tasks.size());
		assertEquals(1, tasks.get(0).getId());

		Task task2 = new Task<>(2, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task2);

		tasks = taskService1.findTaskByStatus("in Progress");
		assertEquals(2, tasks.size());
		assertEquals(2, tasks.get(1).getId());
	}

	@Test
	@DisplayName("Позитивные тесты: удаление созданной ранее Task")
	public void removeTaskPositiveTests() throws OutOfStockException {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		boolean removeTaskTrue = taskService1.removeTask(1);
		assertTrue(removeTaskTrue);

		List<Task> tasks = taskService1.findTaskByStatus("in Progress");
		assertTrue(tasks.isEmpty());
	}

	@Test
	@DisplayName("Негативные тесты: удаление не существующей Task")
	public void removeTaskNegativeTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		boolean removeTaskTrue = taskService1.removeTask(10);
		assertFalse(removeTaskTrue);
	}

	@Test
	@DisplayName("Позитивные тесты: поиск созданной ранее Task по Статусу")
	public void findTaskByStatusPositiveTests() throws OutOfStockException {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		List<Task> actualResult = taskService1.findTaskByStatus("in Progress");
		assertEquals(1, actualResult.size());
		assertEquals(task1, actualResult.get(0));
	}

	@Test
	@DisplayName("Негативные тесты: поиск Task по не существующему Статусу")
	public void findTaskByStatusNegativeTests() throws OutOfStockException {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		List actualResult = taskService1.findTaskByStatus("in Job");
		assertTrue(actualResult.isEmpty());
	}

	@Test
	@DisplayName("Позитивные тесты: поиск созданной ранее Task по Приоритету")
	public void findTaskByPriorityPositiveTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		List<Task> actualResult = taskService1.findTaskByPriority("High");
		assertEquals(1, actualResult.size());
		assertEquals(task1, actualResult.get(0));
	}

	@Test
	@DisplayName("Негативные тесты: поиск созданной ранее Task по не существующему Приоритету")
	public void findTaskByPriorityNrgativeTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		List<Task> actualResult = taskService1.findTaskByPriority("Very High");
		assertTrue(actualResult.isEmpty());
	}

	@Test
	@DisplayName("Позитивные тесты: поиск созданной ранее Task и сортировка по Дате")
	public void findTaskByDatePositiveTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);

		Task task2 = new Task<>(2, "in Progress", "High", "2026.06.11");
		taskService1.addTask(task2);

		List<Task> actualResult = taskService1.sortedTaskByDate();

		System.out.println("Всего задач создано: " + taskService1.sortedTaskByDate().size());
		assertEquals(2, actualResult.size());

		System.out.println("Id task1: " + task1.getId());
		assertEquals(1, actualResult.get(0).getId());

		System.out.println("Id task2: " + task2.getId());
		assertEquals(2, actualResult.get(1).getId());
	}

	@Test
	@DisplayName("Негативные тесты: поиск созданной ранее Task и сортировка по неверным Датам (во второй задаче дата - отсутствует, т.е. она - должна всегда быть ПЕРВОЙ)")
	public void findTaskByDateNegativeTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.11");
		taskService1.addTask(task1);

		Task task2 = new Task<>(2, "in Progress", "High", "");
		taskService1.addTask(task2);

		List<Task> actualResult = taskService1.sortedTaskByDate();

		System.out.println("Всего задач создано: " + taskService1.sortedTaskByDate().size());
		assertEquals(2, actualResult.size());

		System.out.println("Id task1: " + task1.getId());
		System.out.println("Id task2 (БЕЗ ДАТЫ): " + task2.getId());
		assertEquals(2, actualResult.get(0).getId());
		assertEquals(1, actualResult.get(1).getId());
	}
}

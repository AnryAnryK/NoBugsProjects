package dz_14_ComplexTasks.task6;

import org.example.dz_14_ComplexTasks.task6.Task;
import org.example.dz_14_ComplexTasks.task6.TaskService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskServiceTest {
	TaskService taskService1 = new TaskService();
	List<Task> tasks;

	@Test
	@DisplayName("Позитивные тесты: добавление новой Task")
	public void addNewTaskPositiveTests() {

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
	public void removeTaskPositiveTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);
		assertEquals(1, task1.getId());

		boolean removeTaskTrue = taskService1.removeTask(1);
		assertTrue(removeTaskTrue);

		List<Task> tasks = taskService1.findTaskByStatus("in Progress");
		assertTrue(tasks.isEmpty());
	}

	@Test
	@DisplayName("Позитивные тесты: поиск созданной ранее Task по Статусу")
	public void findTaskByStatusPositiveTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);
		assertEquals(1, task1.getId());

		taskService1.findTaskByStatus("in Progress");
		assertEquals(1, task1.getId());
	}

	@Test
	@DisplayName("Позитивные тесты: поиск созданной ранее Task по Приоритету")
	public void findTaskByPriorityPositiveTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);
		assertEquals(1, task1.getId());

		taskService1.findTaskByPriority("High");
		assertEquals(1, task1.getId());
	}

	@Test
	@DisplayName("Позитивные тесты: поиск созданной ранее Task и сортировка по Дате")
	public void findTaskByDatePositiveTests() {

		Task task1 = new Task<>(1, "in Progress", "High", "2026.06.10");
		taskService1.addTask(task1);
		assertEquals(1, task1.getId());

		Task task2 = new Task<>(2, "in Progress", "High", "2026.06.11");
		taskService1.addTask(task2);

		taskService1.sortedTaskByDate("2026.06.10");
		assertEquals(1, task1.getId());
	}
}

package org.example.answerBook.collectionsInJava.task4;

/*
4. Соответствие имён и возрастов
 Храни пары имя-возраст и обеспечь возможность быстро находить возраст по имени.
 */

import java.util.HashMap;
import java.util.Map;

public class Person {
	private Map<String, Integer> persons = new HashMap<>();

	public void addPerson(String name, int age) {
		persons.put(name, age);
	}

	public void findPersonByName(String name) {
		Integer age = persons.get(name);
		if (age != null) {
			System.out.println("Возраст лиц, с именем " + name + " = " + age);
		}
	}

	public void findPersonByAge(Integer age) {
		boolean result = false;
		for (Map.Entry<String, Integer> entry : persons.entrySet()) {
			if (entry.getValue() == age) {
				System.out.println("Имя лиц, с возрастом " + age + " : " + entry.getKey());
				result = true;
			}
		}
		if (!result) {
			System.out.println("Лиц, с возрастом " + age + " - не найдено");
		}
	}

	public void printPersons() {
		System.out.println("Всего лиц: " + persons);
	}
}

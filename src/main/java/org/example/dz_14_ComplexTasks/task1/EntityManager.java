package org.example.dz_14_ComplexTasks.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends User> {

	private final CopyOnWriteArrayList<T> list1 = new CopyOnWriteArrayList<>();


	public synchronized T addUser(T user) {
		list1.add(user);
		return user;
	}

	public synchronized List<T> getAllUsers() {
		return List.copyOf(list1);
	}

	public synchronized boolean removeUser(T user) {
		if (!list1.isEmpty()) {
			return list1.remove(user);
		}
		return false;
	}

	public List<T> filterByIsActive(boolean isActive) {
		return list1.stream()
				.filter(x -> x.isActive() == isActive)
				.collect(Collectors.toList());
	}


	public List<T> filterByAge(int minAge, int maxAge) {
		return list1.stream()
				.filter(user -> user.getAge() >= minAge && user.getAge() <= maxAge)
				.map(user -> (T) user)
				.collect(Collectors.toList());
	}

	public List<T> filterByName(String name) {
		return list1.stream()
				.filter(user -> user.getName().equalsIgnoreCase(name))
				.map(user -> (T) user)
				.collect(Collectors.toList());
	}
}

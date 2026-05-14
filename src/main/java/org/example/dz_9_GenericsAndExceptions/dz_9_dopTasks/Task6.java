package org.example.dz_9_GenericsAndExceptions.dz_9_dopTasks;

public class Task6<T> implements Container<T> {
	/*
	Обобщённый интерфейс
Задача: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().
	 */
	private T item;

	@Override
	public void add(T item) {
		this.item = item;
	}

	@Override
	public T get() {
		return item;
	}

	public static void main(String[] args) {
		Task6 tsk6 = new Task6();
		tsk6.add("Что-то интересное");
		System.out.println(tsk6.get());
	}
}


interface Container<T> {

	void add(T item);

	T get();
}
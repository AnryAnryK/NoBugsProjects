package org.example.dz_9.dz_9_Generics;

public class Task3 {

	/*
	3. Задача на дженерик с двумя типами данных:
Определите класс Pair с использованием двух дженерик типов <T, U>.
В классе Pair создайте две переменные экземпляра разных типов: T first и U second.
Реализуйте методы setFirst(T item), getFirst(), setSecond(U item) и getSecond() для работы с этими объектами.
	 */

	public static void main(String[] args) {

		Pair<Integer, String> pair1 = new Pair<>();
		pair1.setFirst(1);
		pair1.setSecond("Один");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecond());

		Pair<String, Integer> pair2 = new Pair<>();
		pair2.setFirst("Один");
		pair2.setSecond(1);
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
	}

}

class Pair<T, U> {
	private T first;
	private U second;

	public void setFirst(T first) {
		this.first = first;
	}

	public T getFirst() {
		return first;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	public U getSecond() {
		return second;
	}
}

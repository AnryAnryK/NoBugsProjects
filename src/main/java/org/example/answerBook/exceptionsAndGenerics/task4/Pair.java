package org.example.answerBook.exceptionsAndGenerics.task4;

/*
4. Связанная пара
 Класс Pair<K, V> с методом toString().
 */

public class Pair<K, V> {
	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair<>(1, "Понедельник");
		Pair<Integer, String> pair2 = new Pair<>(2, "Вторник");

		System.out.println(pair);
		System.out.println(pair2);
	}

	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Ключ: " + key + ", Значение: " + value;
	}
}

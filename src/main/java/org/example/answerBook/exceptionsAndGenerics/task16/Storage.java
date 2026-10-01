package org.example.answerBook.exceptionsAndGenerics.task16;

public class Storage<T> implements StorageInterface<T> {
	@Override
	public void save(T item) {
		System.out.println("В хранилище находится: " + item);
	}
}

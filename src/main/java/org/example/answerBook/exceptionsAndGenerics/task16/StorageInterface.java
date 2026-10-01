package org.example.answerBook.exceptionsAndGenerics.task16;

/*
16. Интерфейс хранилища
 Обобщённый интерфейс Storage<T>.
 */

public interface StorageInterface<T> {
	void save(T item);
}

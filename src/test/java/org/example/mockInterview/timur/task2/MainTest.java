package org.example.mockInterview.timur.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {




	@Test
	@DisplayName("Позитивный тест: Добавление Книг")
	public void addBookToLibraryPositiveTest() throws Exception {

		Book book1 = new Book("450 градусов по Фаренгейту", "Рэй Брэдбери", 1);
		Book book2 = new Book("Винни-Пух", "Александр Милн", 1);

		Library library1 = new Library("Ленинская библиотека", new ArrayList<>());

		LibraryManager libraryManager = new LibraryManager();


		libraryManager.showListOfAvailableBooksInTheLibrary(library1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(2, library1.getListOfBooks().size());
		assertEquals(2, library1.getListOfBooks().get(0).getCountOfBooks());
		assertEquals(1, library1.getListOfBooks().get(1).getCountOfBooks());
	}

	@Test
	@DisplayName("Позитивный тест: Выдача Книг")
	public void libraryGivesBookToReaderPositiveTest() throws Exception {

		Book book1 = new Book("450 градусов по Фаренгейту", "Рэй Брэдбери", 1);
		Book book2 = new Book("Винни-Пух", "Александр Милн", 1);

		Library library1 = new Library("Ленинская библиотека", new ArrayList<>());

		LibraryManager libraryManager = new LibraryManager();

		libraryManager.showListOfAvailableBooksInTheLibrary(library1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(2, library1.getListOfBooks().size());
		assertEquals(2, library1.getListOfBooks().get(0).getCountOfBooks());
		assertEquals(1, library1.getListOfBooks().get(1).getCountOfBooks());

		libraryManager.libraryGivesBookToReader(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(1, library1.getListOfBooks().size());
		assertEquals(2, library1.getListOfBooks().get(0).getCountOfBooks());
	}

	@Test
	@DisplayName("Позитивный тест: Получение Книг обратно")
	public void libraryTakesBookFromReaderPositiveTest() throws Exception {

		Book book1 = new Book("450 градусов по Фаренгейту", "Рэй Брэдбери", 1);
		Book book2 = new Book("Винни-Пух", "Александр Милн", 1);

		Library library1 = new Library("Ленинская библиотека", new ArrayList<>());

		LibraryManager libraryManager = new LibraryManager();

		libraryManager.showListOfAvailableBooksInTheLibrary(library1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(2, library1.getListOfBooks().size());
		assertEquals(2, library1.getListOfBooks().get(0).getCountOfBooks());
		assertEquals(1, library1.getListOfBooks().get(1).getCountOfBooks());

		libraryManager.libraryGivesBookToReader(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(1, library1.getListOfBooks().size());
		assertEquals(2, library1.getListOfBooks().get(0).getCountOfBooks());

		libraryManager.libraryTakesBookFromReader(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(2, library1.getListOfBooks().size());
		assertEquals(2, library1.getListOfBooks().get(0).getCountOfBooks());
		assertEquals(1, library1.getListOfBooks().get(1).getCountOfBooks());
	}

	@Test
	@DisplayName("Негативный тест: Выдача Книг, когда кол-во Книг = 0")
	public void libraryGivesBookToReaderNegativeTest() throws Exception {

		Book book1 = new Book("450 градусов по Фаренгейту", "Рэй Брэдбери", 1);
		Book book2 = new Book("Винни-Пух", "Александр Милн", 1);

		Library library1 = new Library("Ленинская библиотека", new ArrayList<>());

		LibraryManager libraryManager = new LibraryManager();

		libraryManager.showListOfAvailableBooksInTheLibrary(library1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.addBookToLibrary(library1, book1);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		libraryManager.libraryGivesBookToReader(library1, book2);
		libraryManager.libraryGivesBookToReader(library1, book2);
		libraryManager.showListOfAvailableBooksInTheLibrary(library1);

		assertEquals(1, library1.getListOfBooks().size());
		assertEquals(3, library1.getListOfBooks().get(0).getCountOfBooks());
	}

	@Test
	@DisplayName("Негативный тест: показать кол-во доступных книг в Библиотеке, в которой значения Названия Библиотеки и значение Книг = null")
	public void showListOfAvailableBooksInTheLibraryNegativeTest() throws Exception {

		Book book1 = new Book("450 градусов по Фаренгейту", "Рэй Брэдбери", 1);

		Library library1 = new Library("Ленинская библиотека", new ArrayList<>());
		Library library2 = new Library(null, new ArrayList<>());

		LibraryManager libraryManager = new LibraryManager();

		assertThrows(IllegalArgumentException.class, () -> libraryManager.addBookToLibrary(null, book1));
		assertThrows(IllegalArgumentException.class, () -> libraryManager.addBookToLibrary(library1, null));
		assertThrows(IllegalArgumentException.class, () -> libraryManager.addBookToLibrary(library2, book1));

	}
}

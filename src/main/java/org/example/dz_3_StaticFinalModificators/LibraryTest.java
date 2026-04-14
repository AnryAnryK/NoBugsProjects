package org.example.dz_3_StaticFinalModificators;

public class LibraryTest {


	public static void main(String[] args) {
		Library library = new Library("Моби Дик", "Пушкин", 1730, "Приключения");
		System.out.println("Название : " + library.getBookTitle());
		System.out.println("Автор : " + library.author);
		System.out.println("Год издания : " + library.year);
		System.out.println("Жанр : " + library.category);
	}

}

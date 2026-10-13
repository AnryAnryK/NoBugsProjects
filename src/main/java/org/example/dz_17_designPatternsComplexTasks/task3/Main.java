package org.example.dz_17_designPatternsComplexTasks.task3;

public class Main {
	public static void main(String[] args) {
		BookBuilder bookBuilder = new BookBuilder();
		Book book =
				bookBuilder.setTitle("Война и мир")
						.setAuthor("Лев Толстой")
						.setDescription("Исторический роман про войну с Наполеоном")
						.build();

		BookProxy bookProxy = new BookProxy(book);
		String content = bookProxy.getContent();
		System.out.println("Содержание книги: " + content);
	}
}

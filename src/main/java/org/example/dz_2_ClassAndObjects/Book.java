package org.example.dz_2_ClassAndObjects;

public class Book {

	/*
	Класс Book
Создайте класс Book с полями title и author.
Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
выводящий название и автора книги.

В main создайте книгу, измените автора и выведите информацию.
	 */

	public static void main(String[] args) {

		Book book1 = new Book("Остров сокровищ", "Роберт Стивенсон");
		System.out.println("Данные книги 1 : ");
		book1.printInfo();
		book1.setAuthor("Сервантес");
		System.out.println("===============================================");
		System.out.println("Данные книги 1 после смены автора : ");
		book1.printInfo();
	}

	private String title;
	private String author;

	Book (String newTitle, String newAuthor){
		this.title = newTitle;
		this.author = newAuthor;
	}

	public void setTitle(String newTitle){
		this.title = newTitle;
	}

	public void setAuthor(String newAuthor){
		this.author = newAuthor;
	}

	String getTitle(){
		return this.title;
	}

	String getAuthor(){
		return this.author;
	}

	public void printInfo(){
		System.out.println(this.title);
		System.out.println(this.author);
	}

}

package org.example.expressJavaTasks;

/*
Создать класс Person с полями name и age, геттерами/сеттерами и методом print().
 */

public class ThirteenImplementingPersonWithGettersAndSetters {
	private String name;
	private int age;

	public ThirteenImplementingPersonWithGettersAndSetters(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return  age;
	}

	public void print(){
		System.out.println("Имя: " + getName() + "; возраст: " + getAge());
	}

	public static void main(String[] args) {
		ThirteenImplementingPersonWithGettersAndSetters thirteenImplementingPersonWithGettersAndSetters = new ThirteenImplementingPersonWithGettersAndSetters("Вася", 25);
		thirteenImplementingPersonWithGettersAndSetters.print();

		thirteenImplementingPersonWithGettersAndSetters.setName("Петя");
		thirteenImplementingPersonWithGettersAndSetters.setAge(30);
		thirteenImplementingPersonWithGettersAndSetters.print();
	}
}



package org.example.dz_6_OopPrinciplesInJava.task1_Zoo;

public class Zoo {

	private Animal animal;

	final static int MAX_COUNT_ANIMAL = 3;
	int countAnimal = 0;

	public void animalIn(Animal animal) {
		if (countAnimal < MAX_COUNT_ANIMAL) {
			System.out.println("Добавляем животное в зоопарк ");
			countAnimal++;
		} else {
			System.out.println("Добавить животное нельзя - Зоопарк полностью заполнен");
		}
	}


	public void animalOut(Animal animal) {
		if (countAnimal <= MAX_COUNT_ANIMAL && countAnimal > 0) {
			System.out.println("Убираем животное из зоопарка ");
			countAnimal--;
		} else {
			System.out.println("Некого убирать из зоопарка");
		}
	}


	public void printCountAnimal() {
		System.out.println("Животных в зоопарке: " + countAnimal);
	}

	public void showBehavior(Animal animal) {
		animal.makeNoice();
		animal.move();
	}
}

package org.example.dz_6_OopPrinciplesInJava.task2_PetManagement;


class AnimalShelter {

	static final int MAX_COUNT_ANIMALS = 2;
	int countAnimal = 0;

	void animalIn(Animal animal) {
		if (countAnimal < MAX_COUNT_ANIMALS) {
			System.out.println("Добавляем животное в приют ");
			countAnimal++;
		} else {
			System.out.println("Добавить животное нельзя - Приют заполнен");
		}
	}

	void animalOut(Animal animal) {
		if (countAnimal <= MAX_COUNT_ANIMALS) {
			System.out.println("Убираем животное из приюта ");
			countAnimal--;
		} else {
			System.out.println("Некого убирать из приюта");
		}
	}

	void printCountAnimal() {
		System.out.println("Животных в приюте: " + countAnimal);
	}

	public void showBehavior(Animal animal){
		animal.eat();
		animal.behaviour();
	}
}

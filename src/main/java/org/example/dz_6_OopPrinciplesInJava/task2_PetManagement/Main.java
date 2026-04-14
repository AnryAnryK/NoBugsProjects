package org.example.dz_6_OopPrinciplesInJava.task2_PetManagement;

 class Main {

	public static void main(String[] args) {

		AnimalShelter animalShelter = new AnimalShelter();
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();

		animalShelter.animalIn(dog1);
		animalShelter.showBehavior(dog1);
		animalShelter.printCountAnimal();

		animalShelter.animalIn(cat1);
		animalShelter.showBehavior(cat1);
		animalShelter.printCountAnimal();
		animalShelter.animalOut(dog1);
		animalShelter.printCountAnimal();
	}
}

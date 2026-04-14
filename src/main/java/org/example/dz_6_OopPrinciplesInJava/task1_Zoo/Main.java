package org.example.dz_6_OopPrinciplesInJava.task1_Zoo;

public class Main {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();
		Animal elephant1 = new Elephant();
		Animal elephant2 = new Elephant();
		Animal bird1 = new Bird();
		Animal bird2 = new Bird();

		zoo.animalIn(elephant1);
		zoo.showBehavior(elephant1);
		zoo.printCountAnimal();

		zoo.animalIn(bird1);
		zoo.showBehavior(bird1);
		zoo.printCountAnimal();

		zoo.animalIn(bird2);

		zoo.animalOut(bird1);
		zoo.printCountAnimal();

		zoo.animalIn(elephant2);
		zoo.printCountAnimal();

		zoo.animalOut(bird1);
		zoo.printCountAnimal();

		zoo.animalOut(bird2);
		zoo.printCountAnimal();

		zoo.animalOut(elephant2);
		zoo.printCountAnimal();
	}
}

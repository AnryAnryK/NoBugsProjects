package org.example.dz_6_OopPrinciplesInJava.task5_Farm;

public class Main {

	public static void main(String[] args) {

		Farm farm1 = new Farm();

		Cow cow1 = new Cow();
		farm1.setAnimal(cow1);
		farm1.getAnimal(cow1).showAnimal();

		Chicken chicken1 = new Chicken();
		farm1.setAnimal(chicken1);
		farm1.getAnimal(chicken1).showAnimal();
	}
}

package org.example.dz_6_OopPrinciplesInJava.task4_Aquarium;

public class Main {

	public static void main(String[] args) {
		Shark shark1 = new Shark();
		Starfish starfish1 = new Starfish();
		Aquarium aquarium1 = new Aquarium();

		aquarium1.setAnimal(shark1);
		aquarium1.getAnimal(shark1).showBehaviour();
		aquarium1.setAnimal(starfish1);
		aquarium1.getAnimal(starfish1).showBehaviour();
	}
}

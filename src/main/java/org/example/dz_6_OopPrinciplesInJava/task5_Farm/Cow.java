package org.example.dz_6_OopPrinciplesInJava.task5_Farm;

public class Cow extends Animal implements Eatable, Givingable {

	public String animal = "Корова";

	@Override
	public void eat() {
		System.out.println(animal + " - нуждается в выпасе (ест траву)");
	}

	@Override
	public void toGive() {
		System.out.println(animal + " - даёт молоко");
	}

	@Override
	public void showAnimal(){
		eat();
		toGive();
	}
}

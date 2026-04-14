package org.example.dz_6_OopPrinciplesInJava.task5_Farm;

public class Chicken extends Animal implements Eatable, Givingable {

	public String animal = "Курица";

	@Override
	public void eat() {
		System.out.println(animal + " - требует зерно (ест зерно)");
	}

	@Override
	public void toGive() {
		System.out.println(animal + " - несёт яйца");
	}

	@Override
	public void showAnimal(){
		eat();
		toGive();
	}
}

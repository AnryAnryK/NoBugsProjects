package org.example.dz_6_OopPrinciplesInJava.task2_PetManagement;

 class Dog extends Animal {
	@Override
	 void behaviour() {
		System.out.println("Собака - гуляет ");
	}

	@Override
	 void eat() {
		System.out.println("Собака - ест сухой корм ");
	}
}

package org.example.dz_6_OopPrinciplesInJava.task2_PetManagement;

 class Cat extends Animal{
	@Override
	 void behaviour() {
		System.out.println("Кошка - играет ");
	}

	@Override
	public void eat() {
		System.out.println("Кошка - ест влажный корм ");
	}
}

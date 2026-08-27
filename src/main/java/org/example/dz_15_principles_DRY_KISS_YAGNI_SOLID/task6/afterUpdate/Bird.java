package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task6.afterUpdate;

/*
6. Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов.
Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.
 */

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Птица летит");
	}
}

class Penguin implements NotFlyable {
	@Override
	public void notFly() {
		System.out.println("Пингвины не летают");
	}
}

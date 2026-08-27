package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task6.beforeUpdate;

/*
6. Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов.
Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.
 */

class Bird {
	public void fly() {
		System.out.println("Птица летит");
	}
}

class Penguin extends Bird {
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Пингвины не летают");
	}
}

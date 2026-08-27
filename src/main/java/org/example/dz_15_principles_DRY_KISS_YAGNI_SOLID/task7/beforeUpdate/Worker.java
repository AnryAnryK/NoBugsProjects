package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task7.beforeUpdate;

/*
7. Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс.
Задача: Разделите интерфейс на отдельные специализированные интерфейсы.
 */

interface Worker {
	void work();
	void eat();
}
class Programmer implements Worker {
	@Override
	public void work() {
		System.out.println("Программист пишет код");
	}
	@Override
	public void eat() {
		throw new UnsupportedOperationException("Программист не ест на работе");
	}
}

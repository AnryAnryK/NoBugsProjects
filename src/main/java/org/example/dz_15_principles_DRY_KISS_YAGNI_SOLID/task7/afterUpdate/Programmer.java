package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task7.afterUpdate;

/*
7. Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс.
Задача: Разделите интерфейс на отдельные специализированные интерфейсы.
 */


class Programmer implements Workable {

	@Override
	public void work() {
		System.out.println("Программист пишет код");
	}
}

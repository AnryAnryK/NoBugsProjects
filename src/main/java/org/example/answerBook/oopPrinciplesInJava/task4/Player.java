package org.example.answerBook.oopPrinciplesInJava.task4;

/*
4. Игровой персонаж с управлением здоровьем (Инкапсуляция + Защита от некорректных данных)
 Создай класс Player, который содержит поле health.
Значение health нельзя установить напрямую. Должны быть методы takeDamage(int dmg) и heal(int hp), которые управляют изменением.
Значение не может выходить за пределы 0–100.
Пояснение: использование сеттеров/геттеров и валидации для безопасного управления внутренним состоянием.
 */

public class Player {
	private int health;

	public Player(int health) {
		this.health = health;
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException("health не может выходить за пределы 0–100");
		}
	}

	public int getHealth() {
		return health;
	}

	public void takeDamage(int dmg) {

		if (dmg < 0) {
			throw new IllegalArgumentException("Урон не может быть отрицательным");
		}
		health = health - dmg;

		if (health <= 0) {
			health = 0;
			throw new IllegalArgumentException("Персонаж убит");
		}
	}

	public void heal(int hp) {
		if (hp <= 0) {
			throw new IllegalArgumentException("Лечение не может быть с отрицательным значением");
		}
		health = health + hp;

		if (health >= 100) {
			health = 100;
		}
	}

	public String toString() {
		return "Изменение здоровья Персонажа: " + health;
	}
}

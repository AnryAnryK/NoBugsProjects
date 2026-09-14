package org.example.dz_16_designPatterns.builder.task2;

/*
Реализовать строитель для создания персонажей в игре
Описание
В игре игрок создает персонажа, задавая его параметры, такие как здоровье, урон, броня и магия.
Паттерн Builder поможет организовать создание персонажа, позволяя задавать его параметры поэтапно и не перегружать конструктор класса Character.
 */

public class Character {
	private final int health;
	private final int damage;
	private final int armor;
	private final int magic;


	private Character(Builder builder) {
		this.health = builder.health;
		this.damage = builder.damage;
		this.armor = builder.armor;
		this.magic = builder.magic;
	}

	public static class Builder {
		private int health;
		private int damage;
		private int armor;
		private int magic;

		public Builder setHealth(int health) {
			this.health = health;
			return this;
		}

		public Builder setDamage(int damage) {
			this.damage = damage;
			return this;
		}

		public Builder setArmor(int armor) {
			this.armor = armor;
			return this;
		}

		public Builder setMagic(int magic) {
			this.magic = magic;
			return this;
		}

		public Character build() {
			if (health < 0 || damage < 0 || armor < 0 || magic < 0){
				throw new IllegalArgumentException("Характеристики Персонажа не могут иметь значения < 0");
			}
				return new Character(this);
		}
	}

	@Override
	public String toString() {
		return "Характеристики Персонажа -> Здоровье: " + health + ", Урон: " + damage + ", Броня: " + armor + ", Магия: " + magic;
	}
}


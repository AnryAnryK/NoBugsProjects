package org.example.dz_16_designPatterns.factoryMethod.task2;

public class Bow implements DealingDamage{
	@Override
	public String makeDamage() {
		return " -> средний урон в дальнем бою";
	}

	@Override
	public String toString(){
		return "Лук";
	}
}

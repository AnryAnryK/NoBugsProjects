package org.example.dz_16_designPatterns.factoryMethod.task2;

public class Sword implements DealingDamage{
	@Override
	public String makeDamage() {
		return " -> высокий урон в ближнем бою";
	}

	@Override
	public String toString(){
		return "Меч";
	}
}

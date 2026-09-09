package org.example.dz_16_designPatterns.factoryMethod.task2;

public class Gun implements DealingDamage{
	@Override
	public String makeDamage() {
		return " -> высокий урон в дальнем бою";
	}
	@Override
	public String toString(){
		return "Пистолет";
	}
}

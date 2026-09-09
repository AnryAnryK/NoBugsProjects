package org.example.dz_16_designPatterns.factoryMethod.task2;

public abstract class MakeWeapon {
	abstract DealingDamage makeWeapon();

	public void makeDamage() {
		DealingDamage dealingDamage = makeWeapon();
		System.out.println(dealingDamage.makeDamage());
	}
}

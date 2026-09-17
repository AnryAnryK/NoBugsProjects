package org.example.dz_16_designPatterns.facade.task2;

public class Conditioner {
	private boolean conditionerIsOn;

	public void turnOn() {
		conditionerIsOn = true;
		System.out.println("Кондиционер включен");
	}

	public void turnOff() {
		conditionerIsOn = false;
		System.out.println("Кондиционер выключен");
	}

	public boolean conditionerIsOn() {
		return conditionerIsOn;
	}
}

package org.example.dz_16_designPatterns.facade.task2;

public class Light {
	private boolean lightIsOn;

	public void turnOn() {
		lightIsOn = true;
		System.out.println("Свет включен");
	}

	public void turnOff() {
		lightIsOn = false;
		System.out.println("Свет выключен");
	}

	public boolean lightIsOn() {
		return lightIsOn;
	}
}

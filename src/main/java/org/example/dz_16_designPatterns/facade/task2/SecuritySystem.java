package org.example.dz_16_designPatterns.facade.task2;

public class SecuritySystem {
	private boolean securitySystem;

	public void turnOn() {
		securitySystem = true;
		System.out.println("Система безопасности включена");
	}
	public void turnOff() {
		securitySystem = false;
		System.out.println("Система безопасности выключена");
	}
	public boolean securitySystemIsOn(){
		return securitySystem;
	}
}

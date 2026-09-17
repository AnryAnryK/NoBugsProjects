package org.example.dz_16_designPatterns.facade.task2;

public class MainSmartHome {
	public static void main(String[] args) {
		SmartHome smartHome = new SmartHome();

		smartHome.lightOn();
		smartHome.lightOff();

		smartHome.conditionerOn();
		smartHome.conditionerOff();

		smartHome.securitySystemOn();
		smartHome.securitySystemOff();
	}
}

package org.example.dz_16_designPatterns.facade.task2;

/*
Фасад для системы "Умный дом"
Описание
В системе "Умный дом" есть несколько устройств, которые управляют:
Светом (включить/выключить).
Кондиционером (включить/выключить).
Системой безопасности (включить/выключить).
Клиенту нужно предоставить единый интерфейс для управления (включение/выключение) всеми этими устройствами, скрыв детали реализации каждого из них.
Используем фасад, который объединит все эти операции в один интерфейс.
 */

public class SmartHome {
	private final Light light;
	private final Conditioner conditioner;
	private final SecuritySystem securitySystem;

	public SmartHome() {
		this.light = new Light();
		this.conditioner = new Conditioner();
		this.securitySystem = new SecuritySystem();
	}

	public void lightOn() {
		light.turnOn();
	}

	public void lightOff() {
		light.turnOff();
	}

	public void conditionerOn() {
		conditioner.turnOn();
	}

	public void conditionerOff() {
		conditioner.turnOff();
	}

	public void securitySystemOn() {
		securitySystem.turnOn();
	}

	public void securitySystemOff() {
		securitySystem.turnOff();
	}
}

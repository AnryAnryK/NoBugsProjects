package org.example.dz_16_designPatterns.factoryMethod.task1;

public class MainTransport {
	public static void main(String[] args) {
		TransportFactory carFactory = new CarFactory();
		TransportFactory bicycleFactory = new BicycleFactory();

		System.out.println(carFactory.createTransport().move());
		System.out.println(bicycleFactory.createTransport().move());
	}
}

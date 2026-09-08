package org.example.dz_16_designPatterns.factoryMethod.task1;

public class BicycleFactory extends TransportFactory{
	@Override
	public Transport createTransport() {
		return new Bicycle();
	}
}

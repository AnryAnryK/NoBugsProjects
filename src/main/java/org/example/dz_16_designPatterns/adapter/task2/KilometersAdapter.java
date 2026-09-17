package org.example.dz_16_designPatterns.adapter.task2;

public class KilometersAdapter implements DistanceMeter {
	private final MileDistanceMeter milesDistance;

	public KilometersAdapter(MileDistanceMeter milesDistance) {
		this.milesDistance = milesDistance;
	}

	@Override
	public double calculateDistances(double val) {
		double miles = milesDistance.calculateDistances(val);
		double kilometers = miles * 1.609344;
		return kilometers;
	}
}

package org.example.dz_16_designPatterns.adapter.task2;

public class MainDistanceMeter {
	public static void main(String[] args) {
		MileDistanceMeter milesDistance = new MileDistanceMeter();
		DistanceMeter distanceMeter = new KilometersAdapter(milesDistance);

		System.out.println(distanceMeter.calculateDistances(1));
		System.out.println(distanceMeter.calculateDistances(2));
	}
}

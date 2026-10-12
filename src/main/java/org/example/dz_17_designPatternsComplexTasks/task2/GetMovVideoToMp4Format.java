package org.example.dz_17_designPatternsComplexTasks.task2;

public class GetMovVideoToMp4Format implements VideoAdapter {
	@Override
	public Video getVideoToMp4Format(String classpath) {
		return new Video(classpath);
	}
}

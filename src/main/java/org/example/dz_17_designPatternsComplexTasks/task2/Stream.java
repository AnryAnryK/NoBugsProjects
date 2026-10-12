package org.example.dz_17_designPatternsComplexTasks.task2;

public class Stream {
	private String format = "MP4";
	private int videoId;

	public Stream(int videoId) {
		this.videoId = videoId;
	}

	public String getFormat() {
		return format;
	}

	public int getId() {
		return videoId;
	}

	@Override
	public String toString() {
		return "Streaming video in " + format + " format, Video ID: " + videoId;
	}
}

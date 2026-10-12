package org.example.dz_17_designPatternsComplexTasks.task2;

public class Main {
	public static void main(String[] args) {
		VideoService videoService = new VideoService(
				new GetAviVideoToMp4Format(),
				new GetMovVideoToMp4Format(),
				new GetWmvVideoToMp4Format());

		String videoPath = "path/to/example.avi";
		Video video = videoService.uploadVideo(videoPath);

		Stream stream = videoService.streamVideo(video.getId());
		System.out.println(stream);
	}
}

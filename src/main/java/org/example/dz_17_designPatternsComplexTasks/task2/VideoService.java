package org.example.dz_17_designPatternsComplexTasks.task2;

/*
Разработка библиотеки для стримингового сервиса видео
Цель: Создать библиотеку, которая обеспечивает функции загрузки и просмотра видео в форматах: AVI, MOV, WMV. Система должна поддерживать загрузку видео
в различных форматах и конвертировать их в единый внутренний формат MP4 для упрощения стриминга.

Паттерны проектирования:
Adapter: Для преобразования загружаемых видео форматов (AVI, MOV, WMV) в внутренний формат MP4.
Facade: Для предоставления упрощенного интерфейса к сложным операциям обработки видео, включая загрузку, конвертацию и стриминг.

Архитектура библиотеки:
VideoService: Класс, использующий паттерн Facade, предоставляет методы uploadVideo и streamVideo, упрощая клиентский доступ к функционалу сервиса.
VideoAdapter: Интерфейс и его реализации для каждого поддерживаемого формата видео, преобразующие видео в формат MP4.

Пример использования:
 */

public class VideoService {

	private GetAviVideoToMp4Format getAviVideoToMp4Format;
	private GetMovVideoToMp4Format getMovVideoToMp4Format;
	private GetWmvVideoToMp4Format getWmvVideoToMp4Format;

	public VideoService(GetAviVideoToMp4Format getAviVideoToMp4Format, GetMovVideoToMp4Format getMovVideoToMp4Format, GetWmvVideoToMp4Format getWmvVideoToMp4Format) {
		this.getAviVideoToMp4Format = getAviVideoToMp4Format;
		this.getMovVideoToMp4Format = getMovVideoToMp4Format;
		this.getWmvVideoToMp4Format = getWmvVideoToMp4Format;
	}

	public Video uploadVideo(String videoPath) {
		Video video = null;
		if (videoPath.endsWith(".avi")) {
			video = getAviVideoToMp4Format.getVideoToMp4Format(videoPath);
		} else if (videoPath.endsWith(".mov")) {
			video = getMovVideoToMp4Format.getVideoToMp4Format(videoPath);
		} else if (videoPath.endsWith(".wmv")) {
			video = getWmvVideoToMp4Format.getVideoToMp4Format(videoPath);
		}
		return video;
	}

	public Stream streamVideo(int id) {
		return new Stream(id);
	}
}

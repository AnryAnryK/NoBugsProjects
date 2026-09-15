package org.example.dz_16_designPatterns.adapter.task1;

public class WordToPdfAdapter implements Files {
	private WordFiles wordFile;

	public WordToPdfAdapter(WordFiles wordFile) {
		this.wordFile = wordFile;
	}

	@Override
	public String getFileFormat() {
		return "Из " + wordFile.getFileFormat() + " сконвертирован PDF-файл";
	}
}

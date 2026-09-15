package org.example.dz_16_designPatterns.adapter.task1;

public class PdfToWordAdapter implements Files {
	private PdfFiles pdfFile;

	public PdfToWordAdapter(PdfFiles pdfFile) {
		this.pdfFile = pdfFile;
	}

	@Override
	public String getFileFormat() {
		return "Из " + pdfFile.getFileFormat() + " сконвертирован Word-файл";
	}
}

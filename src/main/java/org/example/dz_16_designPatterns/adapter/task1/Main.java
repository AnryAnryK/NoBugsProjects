package org.example.dz_16_designPatterns.adapter.task1;

public class Main {
	public static void main(String[] args) {
		WordFiles wordFiles = new WordFiles();
		PdfFiles pdfFiles = new PdfFiles();

		WordToPdfAdapter wordToPdfAdapter = new WordToPdfAdapter(wordFiles);
		System.out.println(wordToPdfAdapter.getFileFormat());

		PdfToWordAdapter pdfToWordAdapter = new PdfToWordAdapter(pdfFiles);
		System.out.println(pdfToWordAdapter.getFileFormat());
	}
}

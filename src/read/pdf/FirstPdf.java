package read.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class FirstPdf {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		
		File f = new File("D:\\PAVI_in\\Demo.pdf");
		
		PDDocument doc = PDDocument.load(f);
		
		PDFTextStripper text = new PDFTextStripper();
		
		String pdfText = text.getText(doc);
		
		System.out.println(pdfText);

	}
}

package read.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlFromPDF {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\PAVI_in\\SeleniumURL.pdf");
		PDDocument doc=PDDocument.load(f);
		PDFTextStripper text=new PDFTextStripper();
		
		String[] pdfText=text.getText(doc).split(":",2);
		
		System.out.println(pdfText[1]);
		
		System.setProperty("webdriver.chrome.driver","D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(pdfText[1]);
		driver.close();
	}

}

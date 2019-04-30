package org.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptScroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.seleniumhq.org/");

		js.executeScript("window.scrollBy(0,400)"); // to scroll down by 400pixel in y axis
		js.executeScript("window.scrollBy(400,0)"); // to scroll down by 400pixel

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll down
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(document.body.scrollWidth,0)"); // scroll up

		System.out.println("title     --->    " + js.executeScript("document.title"));
		System.out.println("url       --->    " + js.executeScript("document.URL")); // to get url
		
		// js.executeScript("history.go(0)"); //to reload the page
		// js.executeScript("history.back(0)"); //to reload the page
		// js.executeScript("history.forward(0)"); //to reload the page

		WebElement ele = driver.findElement(By.xpath("//h2[text()='Selenium News']"));

		js.executeScript("arguments[0].scrollIntoView();", ele); //scroll to the particular element
		System.out.println(ele.getText());
		Thread.sleep(3000);
		driver.close();

	}

}
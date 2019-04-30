package org.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Next3 {

	@FindBy(xpath = "//div[@class='_2zg3yZ']/nav/a[text()='5']")
	private WebElement five;

	@FindBy(xpath = "//img[@alt='C# 5.0 Pocket Reference']|//img[@alt='C# 4.0 Pocket Reference']")
	private WebElement csharp;

	public Flipkart_Next3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void fk_five(JavascriptExecutor js) {
		js.executeScript("arguments[0].scrollIntoView();", five);
		five.click();
	}

	public void fk_csharp() {
		csharp.click();
	}

}

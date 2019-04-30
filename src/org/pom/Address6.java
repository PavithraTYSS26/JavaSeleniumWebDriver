package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address6 {
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement addpro;
	
	
	public  Address6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addProceed()
	{
		addpro.click();
	}

}

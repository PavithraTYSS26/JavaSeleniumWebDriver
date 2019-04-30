package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedAutomation4 {
	@FindBy(xpath=" //p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	
	
	
	public ProceedAutomation4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void go_btn()
	{
		proceed.click();
	}

}

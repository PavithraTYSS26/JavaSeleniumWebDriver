package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintDressAdd2Cart3 {

	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	
	
	
	public PrintDressAdd2Cart3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void go_btn()
	{
		cart.click();
	}
	public void proceed_btn()
	{
		proceed.click();
	}

}

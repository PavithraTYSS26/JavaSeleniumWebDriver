package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Home {
	@FindBy(xpath="//div[@class='_3Njdz7']/button")
	private WebElement close;
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement search;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	
	public Flipkart_Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fk_close()
	{
		close.click();
	}
	
	
	public void fk_srch_sendKeys(String str)
	{
		search.sendKeys(str);
	}
	public void fk_go_btn()
	{
		submit.click();
	}

}

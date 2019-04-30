package org.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart2_Price_Rate {
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement price;
	
	@FindBy(xpath="//span[text()='Price']")
	private WebElement scroll;
	
	
	@FindBy(xpath="//div[text()='4★ & above']/preceding-sibling::input/parent::label")
	private WebElement highrate;
	
	
	public Flipkart2_Price_Rate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void fk_priceL2H()
	{
		price.click();
	}
	
	public void fk_scroll(JavascriptExecutor js)
	{
		js.executeScript("arguments[0].scrollIntoView();",scroll );
	}
	public void fk_rating(Actions act)
	{
		act.moveToElement(highrate).build().perform();
		highrate.click();
	}

}

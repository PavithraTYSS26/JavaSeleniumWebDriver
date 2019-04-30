package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPOM1 {

	@FindBy(id="search_query_top")
	private WebElement search;
	
	@FindBy(name="submit_search")
	private WebElement submitSearch;
	
	
	public AutomationPOM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void srch_sendKeys(String str)
	{
		search.sendKeys(str);
	}
	
	public void scrh_clear()
	{
		search.clear();
	}
	
	public void go_btn()
	{
		submitSearch.click();
	}
}

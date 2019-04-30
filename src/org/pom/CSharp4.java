package org.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSharp4 {
	@FindBy(xpath = "//div[@class='_1HmYoV hCUpcT']/div/div[2]/div/ul/li/button")
	private WebElement csharp;

	@FindBy(xpath = "//div[@class='_2CQPOE _1J8_NP']/form/button")
	private WebElement placeorder;

	@FindBy(xpath = "//form/div/input")
	private WebElement phn;

	@FindBy(xpath = "//div/button")
	private WebElement contn;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;

	public CSharp4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void fk_add2cart(WebDriver driver) {

		csharp.click();
	}

	public void fk_placeorder(WebDriver driver) {

		placeorder.click();
	}

	public void fk_phn_send(String str) {
		phn.sendKeys(str);
	}

	public void fk_pwd_send(String str) {
		pwd.sendKeys(str);
	}

	public void fk_continue() {

		contn.click();
	}

	public void fk_login() {

		login.click();
	}

}

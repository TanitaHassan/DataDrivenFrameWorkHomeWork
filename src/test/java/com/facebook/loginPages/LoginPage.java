package com.facebook.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);//POM design
	}

	@FindBy(how = How.ID, using = "email")
	WebElement userName;

	public WebElement userNameMethod(String enterUserName) {
		userName.sendKeys(enterUserName);
		return userName;

	}

	@FindBy(how = How.NAME, using = "pass")
	public WebElement passWord;

	public WebElement passwordMethod(String enterPass) {
		passWord.sendKeys(enterPass);
		return passWord;

	}

	@FindBy(how = How.XPATH, using = "//button[starts-with(@id,'u_0_5_')]")
	private WebElement loginButton;

	public void loginMethod() {
		loginButton.click();

	}

}

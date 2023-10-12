package com.facebook.registrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);//Pom design
	}
	@FindBy(how=How.XPATH,using="//a[starts-with(@id,'u_0_0_')]")private WebElement createAccount;
public void createNewAcc() {
	createAccount.click();
	
}
@FindBy(how=How.NAME,using="firstname")public WebElement firstName;
public WebElement fName(String enterName) {
	firstName.sendKeys(enterName);
	return firstName;
	
}
@FindBy(how=How.NAME,using="lastname")public WebElement lastName;
public WebElement lNmae(String enterNameLast) {
	lastName.sendKeys(enterNameLast);
	return lastName;
	
}
@FindBy(how=How.NAME,using="reg_email__")public WebElement email;
public WebElement email(String enterEmail) {
	email.sendKeys(enterEmail);
	return email;
	
}
@FindBy(how=How.NAME,using="reg_email_confirmation__")public WebElement verifyEmail;
public WebElement reEmail(String reEnterEmail) {
	verifyEmail.sendKeys(reEnterEmail);
	return verifyEmail;
	
}
@FindBy(how=How.ID,using="password_step_input")private WebElement newPass;
public WebElement newPassword(String enterNewPass) {
	newPass.sendKeys(enterNewPass);
	return newPass;
}

}

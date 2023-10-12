package com.facebook.loginTests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest { //basetest extends
	LoginPage loginPage; //loginpage er sthe relation
	PropertiesReader propertiesReader; //properties reader sthe connection 
	
	@BeforeMethod
	public void openFacebook() {
		openApp();
		
	}
	@Test
	
	public void loginTest() {
		propertiesReader=new PropertiesReader();//referential object for properties reader
		loginPage=new LoginPage(driver);//referntial object for loginpage
		loginPage.userNameMethod(propertiesReader.userName()); //loginpage and propertiesreader work together to call all method for test side here
		loginPage.passwordMethod(propertiesReader.passWord());
		loginPage.loginMethod();
		
		
		
	}
	@AfterMethod
	public void closeApp() {
		closeApp();
	}
	
	
	

}

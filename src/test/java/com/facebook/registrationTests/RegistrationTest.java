package com.facebook.registrationTests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.registrationPages.RegistrationPage;
import com.facebook.utilities.ExcelReader;

public class RegistrationTest extends BaseTest {
	RegistrationPage rp;
	ExcelReader er;
	String file = "src/test/resources/registration.xlsx";
	String sheetName = "Sheet1";
	
	@BeforeMethod
	public void openRegistrationPage() {
		openApp();
	}
	@Test
	public void registrationTest() {
		
		rp=new RegistrationPage(driver);
		rp.createNewAcc();
		er=new ExcelReader(file,sheetName);
		String fName=er.getStringCellValue(1, 0);
		rp.fName(fName);
		String lName=er.getStringCellValue(1, 1);
		rp.lNmae(lName);
		String email=er.getStringCellValue(1, 3);
		rp.email(email);
		String verifyEmail=er.getStringCellValue(1, 3);
		rp.reEmail(verifyEmail);
		String newPass=er.getStringCellValue(1, 4);
		rp.newPassword(newPass);
		
	}

	@AfterMethod
	public void closeFacebook() {
	 closeApp();
	}

}

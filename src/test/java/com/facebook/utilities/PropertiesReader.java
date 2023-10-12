package com.facebook.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	Properties prop;

	public PropertiesReader() { // make a construtor by own with same class name
		prop = new Properties(); // initiate the variable
		String propertyFile = "src/test/resources/test.properties"; // giving the propertyfile path

		try {
			FileInputStream fis = new FileInputStream(propertyFile);
			prop.load(fis); // load everything in propertyfile

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String readBrowser() { // method for each test propertyfile
		return prop.getProperty("browser");

	}

	public String getUrl() {
		return prop.getProperty("qaUrl");
	}

	public String userName() {
		return prop.getProperty("userName");
	}

	public String passWord() {
		return prop.getProperty("password");
	}

	public static void main(String[] args) { // run from main method pure java
		PropertiesReader pr = new PropertiesReader();
		String browserName = pr.readBrowser();
		pr.getUrl();
		pr.userName();
		String passWord = pr.passWord();
		System.out.println(browserName);
		System.out.println(passWord);

	}

}

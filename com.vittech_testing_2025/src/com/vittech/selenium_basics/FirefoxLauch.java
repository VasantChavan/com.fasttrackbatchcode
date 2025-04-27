package com.vittech.selenium_basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLauch {
	
	public static void main(String[] args) {
		
		// It will launch the chrome browser
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("http://www.facebook.com");
		
		//driver.close();
	}

}

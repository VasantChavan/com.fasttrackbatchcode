package com.vittech.selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) {
		
		// It will launch the chrome browser
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://www.facebook.com"); // it will navigate to the application 
		
		//driver.close();
	}

}

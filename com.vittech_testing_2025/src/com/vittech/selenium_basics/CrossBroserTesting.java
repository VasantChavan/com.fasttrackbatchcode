package com.vittech.selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBroserTesting {
	
	static WebDriver driver;
	
	static void launchBrowser(String brname,String appURL)
	{
		if(brname.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(brname.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(brname.equals("Edge")) {
			driver = new EdgeDriver();
		}
		driver.get(appURL);
		driver.manage().window().maximize();
		//driver.close();
	}
	
	public static void main(String[] args) {
		launchBrowser("Firefox","https://www.facebook.com");
//		launchBrowser("Chrome","https://www.google.com");
//		launchBrowser("Edge","https://www.gmail.com");
	}

}

package com.vittech.capture_screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotsUtility {

	public static void main(String[] args) throws IOException {
		
		// Parent p = new Child();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		captureScreenshots(driver,"fb_login");	
		
		
		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@1234%$#");
		
		captureScreenshots(driver,"fb_login_form");
		
		driver.close();

	}
	
	static void captureScreenshots(WebDriver driver, String screenshotname) throws WebDriverException, IOException
	{
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), 
				new File("./Screenshots/"+screenshotname+".png"));
	}

}

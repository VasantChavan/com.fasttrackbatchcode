package com.vittech.capture_screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotsUsingChromeDriver {

	public static void main(String[] args) throws IOException {
		
		//Child ch= = new Child();
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		
		File scr = driver.getScreenshotAs(OutputType.FILE);		
		File target = new File("./Screenshots/image1.png");
		
		FileHandler.copy(scr, target);
		
		
		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@1234%$#");
		
		scr=driver.getScreenshotAs(OutputType.FILE);	
		target = new File("./Screenshots/fb_form1.png");
		
		FileHandler.copy(scr, target);
		
		driver.close();

	}

}

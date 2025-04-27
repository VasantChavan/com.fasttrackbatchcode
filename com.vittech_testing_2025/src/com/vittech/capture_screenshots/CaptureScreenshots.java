package com.vittech.capture_screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {
		
		// Parent p = new Child();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);		
		File target = new File("./Screenshots/image.png");
		
		FileHandler.copy(scr, target);
		
		
		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@1234%$#");
		
		scr=ts.getScreenshotAs(OutputType.FILE);	
		target = new File("./Screenshots/fb_form.png");
		
		FileHandler.copy(scr, target);
		
		driver.close();

	}

}

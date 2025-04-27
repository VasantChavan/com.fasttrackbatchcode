package com.vittech.capture_screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotsBasedOnWebElement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement ele1 = driver.findElement(By.xpath("//div[@class='_8esk']/div[@class='_8esl']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='_8esk']/div[@class='_8esn']"));

		captureScreenshots(ele1, "visibletxt");
		captureScreenshots(ele2, "visible_fb_form");
		
//		File scr = ele1.getScreenshotAs(OutputType.FILE);
//		File target = new File("./Screenshots/myvisibleele.png");
//
//		FileHandler.copy(scr, target);

//		scr = ele2.getScreenshotAs(OutputType.FILE);
//		target = new File("./Screenshots/myvisibleform.png");
//
//		FileHandler.copy(scr, target);
//		
//		
		WebElement emailtxt = driver.findElement(By.name("email"));
//		
		emailtxt.sendKeys("Vasant@gmail.com");
//		
//		scr=emailtxt.getScreenshotAs(OutputType.FILE);
//		target = new File("./Screenshots/emailtxt.png");
//
//		FileHandler.copy(scr, target);
		captureScreenshots(emailtxt,"emailtxt1");
		
		driver.close();
	}
	
	static void captureScreenshots(WebElement ele, String screenshotname) throws WebDriverException, IOException
	{
		FileHandler.copy(ele.getScreenshotAs(OutputType.FILE), 
				new File("./Screenshots/"+screenshotname+".png"));
	}

}

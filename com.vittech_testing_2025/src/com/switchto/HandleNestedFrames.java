package com.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNestedFrames {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		
		System.out.println("Total frame count are "+driver.findElements(By.tagName("frame")).size());
		
		//driver.switchTo().frame(0).switchTo().frame(1);
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		driver.switchTo().parentFrame().switchTo().frame("frame-right");
		
		
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.switchTo().defaultContent().switchTo().frame("frame-bottom");
		
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		//driver.quit();
	}

}

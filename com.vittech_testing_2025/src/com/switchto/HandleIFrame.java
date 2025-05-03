package com.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		
		int iFrames =driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of iframe on the webpage are "+iFrames);
		
		// 3 ways to switch to the frame
		// By using index of the frame
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("mce_0_ifr"); By using name or id of the frame
		
		// by using Web Element of the frame
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		
		driver.switchTo().frame(frame);
		
		
		WebElement txt_area = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		
		System.out.println(txt_area.getText());
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
				
		WebElement link = driver.findElement(By.linkText("Elemental Selenium"));
		
		System.out.println(link.getText());
		
		link.click();
			
		//driver.close();
		
		driver.quit();
	}

}

package com.switchto;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowTabHandle {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String parwin = driver.getWindowHandle();
		
		System.out.println(parwin+"  "+driver.getTitle()+"   "+driver.getCurrentUrl());
		
	//	driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		driver.get("https://www.google.com");
		
		
		
		Set<String> winids = driver.getWindowHandles();
		for(String id:winids)
		{
			if(!parwin.equals(id)) {
			
			driver.switchTo().window(id);
			System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
			driver.close();
			}
			
		}
		
		driver.switchTo().window(parwin);
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		driver.close();
		
		
		
	}

}

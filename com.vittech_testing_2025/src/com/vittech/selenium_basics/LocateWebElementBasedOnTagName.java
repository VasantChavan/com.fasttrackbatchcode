package com.vittech.selenium_basics;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnTagName {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> list_a = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links on facebook login page are :"+list_a.size());
		
		// Approach-01
//		for(int i=0; i<list_a.size();i++)
//		{
//			String linkTxt = list_a.get(i).getText();
//			System.out.println(linkTxt);
//			if(linkTxt.equals("Facebook Lite"))
//			{
//				 list_a.get(i).click();
//				 System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
//				 break;
//			}
//		}
		
		// Approach-02
//		for(WebElement ele:list_a)
//		{
//			//if(ele.getText().equals("Sign Up"))
//			if(ele.getAttribute("innerHTML").equals("Sign Up"))
//			{
//				ele.click();
//				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
//				break;
//			}
//		}
		
		//Approach -03
//		Iterator<WebElement> itr = list_a.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next().getText());
//			if(itr.next().getText().equals("Create a Page"))
//			{
//				itr.next().click();
//				break;
//			}
//			
//		}
//		
		
		handleLink(list_a,"Create new account");
		
		
		driver.close();
	}
	
	static void handleLink(List<WebElement> list, String linkTxt)
	{
		for(WebElement ele:list)
		{
			//System.out.println(ele.getText());
			if(ele.getText().equals(linkTxt))
			{
				ele.click();
				break;
			}
		}
	}

}

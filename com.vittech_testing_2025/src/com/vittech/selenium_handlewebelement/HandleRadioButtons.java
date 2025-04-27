package com.vittech.selenium_handlewebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed());
		
		
		WebElement customRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		
		if(customRadioBtn.isDisplayed() && femaleRadioBtn.isDisplayed() && maleRadioBtn.isDisplayed())
		{
			System.out.println("ALl radio buttons are displayed on the webpage");
			boolean status1 = customRadioBtn.isSelected();
			System.out.println(femaleRadioBtn.isEnabled());
			if(status1) {
				System.out.println("Already custom radio button is selected");
			}
			else
			{
				customRadioBtn.click();
				
			}
		}
		else
		{
			System.out.println("All radio buttons are not displayed on the webpage");
		}
		
	}

}

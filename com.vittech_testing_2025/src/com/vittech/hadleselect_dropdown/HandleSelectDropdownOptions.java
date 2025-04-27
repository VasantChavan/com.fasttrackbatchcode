package com.vittech.hadleselect_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropdownOptions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Sign Up")).click();

		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		WebElement yearDD= driver.findElement(By.name("birthday_year"));
		handleDropdownOptions(monthDD,"Sep");
		handleDropdownOptions(yearDD,"2024");
		
		

//		Select select = new Select(monthDD);
//
//		WebElement beforeSelection = select.getFirstSelectedOption();
//
//		System.out.println("Before selection the selected option in the dropdown is " + beforeSelection.getText());
//
//		select.selectByIndex(7);
//		WebElement afterSelection = select.getFirstSelectedOption();
//
//		System.out.println("After selection the selected option in the dropdown is " + afterSelection.getText());

//		List<WebElement> months = select.getOptions();
//		
//		
////		for(int i=0; i<months.size();i++)
////		{
////			String month = months.get(i).getText();
////			System.out.println(month);
////			if(month.equals("Nov"))
////			{
////				months.get(i).click();
////				break;
////			}
////		}
//		
//		for (WebElement ele : months) {
//			
//			if(ele.getText().equals("Aug"))
//			{
//				ele.click();
//				break;
//			}
//		}
//		
//		System.out.println(select.isMultiple());

	}

	static void handleDropdownOptions(WebElement dropdown, String option) {
		List<WebElement> options = new Select(dropdown).getOptions();
		for (WebElement ele : options) {
			if (ele.getText().equals(option)) {
				ele.click();
				break;
			}
		}
	}
	
	//Assignment 
	//handle the select drop-down without select class.
	// utility function to handle selected options in the dropdown
	
}

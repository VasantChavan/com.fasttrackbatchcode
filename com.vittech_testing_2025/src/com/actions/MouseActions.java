package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	

	static void mouseActions(WebDriver driver,WebElement ele1, WebElement ele2)
	{
		new Actions(driver).moveToElement(ele1).moveToElement(ele2).click().build().perform();
	}

}

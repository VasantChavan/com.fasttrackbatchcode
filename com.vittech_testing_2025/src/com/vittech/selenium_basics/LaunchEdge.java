package com.vittech.selenium_basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {

		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
	}

}

package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestInTestNG {
	
	
	@Test
	@Parameters({"username","password"})
	public void parameterTest(@Optional("vasant@facebook.com")String uname, 
			@Optional("vasant@543$%#")String upass)
	{
		System.out.println(uname+ "  "+upass);
	}
	

}

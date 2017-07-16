package com.testjavamaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	
	@Test
	public static void launchBrowser()
	{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://testingmasters.com/");
		
		driver.manage().window().maximize();
		
		
		
	}
	

}

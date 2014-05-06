package com.croissance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginClass {

	
	@Test
	public void loginMethod() throws InterruptedException{
		
		WebDriver dr= new FirefoxDriver();
		
		dr.navigate().to("https://facebook.com/");
		
		Thread.sleep(10000);
		dr.quit();
	}
}

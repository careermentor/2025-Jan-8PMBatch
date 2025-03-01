package org.xyz.auto.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;   //ctrl+shift+O

public class HandleBrowserControl
{
	
	WebDriver driver;
	
	@Test
	public void launchBrowsrr() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your chrome browser
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.close();  // one window will close
		
		driver.quit();  //will close all the window
		
	}
	
	
}

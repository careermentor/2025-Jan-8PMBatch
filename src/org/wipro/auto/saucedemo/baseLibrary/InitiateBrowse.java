package org.wipro.auto.saucedemo.baseLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.saucedemo.utilitiesLibrary.ReadPropFile;

public class InitiateBrowse
{
	
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFile.readconfig("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFile.readconfig("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadPropFile.readconfig("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		
		driver.get(ReadPropFile.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void quitBrowser()
	{
		//driver.quit();
	}
}

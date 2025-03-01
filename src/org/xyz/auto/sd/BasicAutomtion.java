package org.xyz.auto.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;   //ctrl+shift+O

public class BasicAutomtion
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowsrr()
	{
		
		driver= new ChromeDriver();  //launch your chrome browser
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}

	@Test
	public void loginFunc()
	{
		driver.findElement(By.id("email")).sendKeys("modisantosh12@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("pass12345");
		
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(enabled=false)
	public void SignupFunct()
	{
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
	}
	
	

}

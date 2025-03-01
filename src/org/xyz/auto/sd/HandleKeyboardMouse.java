package org.xyz.auto.sd;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;   //ctrl+shift+O
import org.testng.asserts.SoftAssert;

public class HandleKeyboardMouse
{
	
	WebDriver driver;

	
	@Test
	public void handleFrames() throws Exception
	{
		
		driver= new ChromeDriver(); 
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.TestResults(driver,"handleFrames");
	
	}
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		
		driver= new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
		CaptureScreenshot.TestResults(driver, "handleAlerts_1");
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.TestResults(driver, "handleAlerts_2");
		
	}

	
	
	@Test(enabled=false)
	public void handlemouse() throws Exception
	{
		
		driver= new ChromeDriver(); 
		driver.get("https://www.intellectdesign.com/");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/div/div[2]/div/ul/li[1]/a"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/div/div[2]/div/ul/li[1]/a"))).perform();
		//act.contextClick(driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/div/div[2]/div/ul/li[1]/a"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Products ']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//a[text()='Core Banking']"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Core Banking']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windows_id = driver.getWindowHandles();
		Iterator<String> itr = windows_id.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
		
	}
	
	@Test(enabled=false)
	public void handlekeyboard() throws Exception
	{
		
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("password1").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
		
		
	
	}
	
}

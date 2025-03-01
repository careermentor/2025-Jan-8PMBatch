package org.xyz.auto.sd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;   //ctrl+shift+O
import org.testng.asserts.SoftAssert;

public class DropdownCalendar
{
	
	WebDriver driver;
	
	@Test(enabled=false)
	public void universalorlando() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your chrome browser
		driver.get("https://www.universalorlando.com/web/en/us");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Explore Parks']")).click();
		driver.findElement(By.xpath("//span[text()='Universal Studios Florida']")).click();
		
		System.out.println(driver.findElement(By.xpath("//h2[text()='Experience 8 Lands in 1 Park']")).getText());
	
		
	}
	
	@Test(enabled=true)
	public void launchBrowsrr() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your chrome browser
		
		String Exp_URL = "https://thetestingworld.com/testings/";
		
		
		
		driver.get(Exp_URL);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		String Act_URL= driver.getCurrentUrl();
		System.out.println(Act_URL);
		
		//Assert.assertEquals(Act_URL, Exp_URL);   //hard assertion 
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Act_URL, Exp_URL);   //Soft assertion
		
		String Exp_title = "Login & Sign Up Forms";
		
		String Act_Title= driver.getTitle();
		System.out.println(Act_Title);
		
		sa.assertEquals(Act_Title, Exp_title);
		
		String Exp_usernamefield = "myusername";
		String Act_usernamefield  = driver.findElement(By.name("fld_username")).getAttribute("placeholder");
		
		System.out.println(Act_usernamefield);
		
		sa.assertEquals(Act_usernamefield, Exp_usernamefield);
		
		String Exp_text_iAgree = "I agree with terms and conditions Read Detail";
		
		String Act_text_iAgree = driver.findElement(By.xpath("//em[text()='I agree with terms and conditions ']")).getText();
		
		sa.assertEquals(Act_text_iAgree, Exp_text_iAgree);
		
		WebElement abc = driver.findElement(By.name("fld_username"));
		abc.sendKeys("selenium");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		driver.findElement(By.name("phone")).sendKeys("123455");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		
	//	gen.selectByIndex(1);
	//	gen.selectByValue("2");
	//	gen.selectByVisibleText("Male");
		gen.selectByVisibleText("Female");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		
		st.selectByVisibleText("Florida");
		
		Point register_loc = driver.findElement(By.xpath("//label[text()='Register']")).getLocation();
		System.out.println(register_loc);
		
		
		
		//System.out.println(driver.getPageSource());
		
		boolean register_displayed = driver.findElement(By.xpath("//label[text()='Register']")).isDisplayed();
		System.out.println(register_displayed);
		Assert.assertEquals(register_displayed, true);
		
		boolean checkbox_notchecked = driver.findElement(By.name("terms")).isSelected();
		System.out.println(checkbox_notchecked);
		
		driver.findElement(By.name("terms")).click();
		
		boolean checkbox_checked = driver.findElement(By.name("terms")).isSelected();
		System.out.println(checkbox_checked);
		
		boolean signup_enabled = driver.findElement(By.cssSelector("[value='Sign up']")).isEnabled();
		System.out.println(signup_enabled);
		
		sa.assertAll();
	}
	
	
	
	
}

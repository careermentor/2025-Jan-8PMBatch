package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.saucedemo.utilitiesLibrary.ReadPropFile;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("login_createnewaccount_xpath"))).click();
	}
	

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_lastname_name"))).sendKeys(lname);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_dob_day_name"))));
		dob_day.selectByVisibleText(day);
		
	}
	
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_signupbuttn_name"))).click();
	}
	
}

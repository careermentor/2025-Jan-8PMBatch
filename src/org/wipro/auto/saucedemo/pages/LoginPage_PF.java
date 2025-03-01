package org.wipro.auto.saucedemo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="email")
	WebElement enter_username;
	
	@FindBy(name="pass")
	WebElement enter_password;
	
	@FindBy(css="[type='submit']")
	WebElement click_loginBttn;
	
	
	
	public void login(String uname, String pass)
	{
		enter_username.sendKeys(uname);
		enter_password.sendKeys(pass);
		click_loginBttn.click();
	}
	
	
}

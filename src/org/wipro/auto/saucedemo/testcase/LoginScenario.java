package org.wipro.auto.saucedemo.testcase;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.baseLibrary.InitiateBrowse;
import org.wipro.auto.saucedemo.pages.LoginPage;

public class LoginScenario extends InitiateBrowse
{

	@Test
	public void tc01_validate_login_valid_credential() throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
	}
	

	
}

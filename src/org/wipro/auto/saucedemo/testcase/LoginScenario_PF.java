package org.wipro.auto.saucedemo.testcase;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.baseLibrary.InitiateBrowse;
import org.wipro.auto.saucedemo.pages.LoginPage;

public class LoginScenario_PF extends InitiateBrowse
{

	@Test
	public void tc01_validate_login_valid_credential() throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		
		
		
	}
	
}

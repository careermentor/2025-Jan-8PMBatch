package org.wipro.auto.saucedemo.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.baseLibrary.InitiateBrowse;
import org.wipro.auto.saucedemo.dataGeneratorLibrary.TestDataGenerator;
import org.wipro.auto.saucedemo.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowse
{

	@Test(dataProvider="login",dataProviderClass=TestDataGenerator.class)
	public void tc01_validate_login_valid_credential(String username, String password) throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		
	}
	
	
	
	
	
}

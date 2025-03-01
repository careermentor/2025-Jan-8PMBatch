package org.wipro.auto.saucedemo.testcase;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.baseLibrary.InitiateBrowse;
import org.wipro.auto.saucedemo.pages.SignupPage;

public class SignupScenario extends InitiateBrowse
{

	@Test
	public void tc02_validate_signup_valid_credential() throws Exception
	{
		
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("John");
		sign.enter_lastname("David");
		sign.select_dob_day("26");
		sign.click_signupbttn();
		
	}
	
		
}

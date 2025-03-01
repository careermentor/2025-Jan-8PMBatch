package org.wipro.auto.saucedemo.testcase;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.baseLibrary.InitiateBrowse;
import org.wipro.auto.saucedemo.dataGeneratorLibrary.TestDataGenerator;
import org.wipro.auto.saucedemo.pages.SignupPage;

public class SignupScenario_DDF extends InitiateBrowse
{

	@Test(dataProvider="signup",dataProviderClass=TestDataGenerator.class)
	public void tc02_validate_signup_valid_credential(String firstname, String lastname) throws Exception
	{
		
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname(firstname);
		sign.enter_lastname(lastname);
		sign.select_dob_day("26");
		sign.click_signupbttn();
		
	}
	
		
}

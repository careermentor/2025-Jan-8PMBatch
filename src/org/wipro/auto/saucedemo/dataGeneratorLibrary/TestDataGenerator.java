package org.wipro.auto.saucedemo.dataGeneratorLibrary;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="login")
	public Object[][] testdata1()
	{
		//String name="user1";
		//Object[] data1 = {"user1","pass1"};   //1-D array
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};   //2-D array
		
		return data2;
		
	}
	
	
	
	@DataProvider(name="signup")
	public Object[][] testdata2()
	{
		//String name="user1";
		//Object[] data1 = {"user1","pass1"};   //1-D array
		Object[][] data2 = {{"fname1","lname1"},{"fname2","lname2"},{"fname3","lname3"}};   //2-D array
		
		return data2;
		
	}
	
	
}

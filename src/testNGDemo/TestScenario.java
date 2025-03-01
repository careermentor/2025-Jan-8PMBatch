package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("Hello", "Hello World");
	}
	
	@Test(priority=2,groups="Smoke")
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test(groups="Regression")
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
		Assert.assertEquals("Hello", "Hello World");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
	
}

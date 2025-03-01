package oopsConcepts;

public class CallDemoInterface implements DemoInterface
{

	
	public void m1() 
	{
		
		System.out.println("interface methord1");
		
	}

	
	public void m2() 
	{
	
		System.out.println("interface methord2");
		
	}

	public static void main(String[] args)
	{
		
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.m1();
		cdi.m2();
		
	}
	
	
}

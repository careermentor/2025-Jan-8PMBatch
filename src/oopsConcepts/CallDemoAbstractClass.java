package oopsConcepts;

public class CallDemoAbstractClass extends DemoAbstractClass
{

	
	public void meth2() 
	{
		
		System.out.println("this is my secret password");
	}

	
	
	public static void main(String[] args) 
	{
		
		CallDemoAbstractClass abc= new CallDemoAbstractClass();
		abc.meth2();
		abc.meth1();
		
	}
	
}

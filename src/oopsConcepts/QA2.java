package oopsConcepts;

public class QA2 extends QA1
{
	
	
	int x = 100;
	
	public void printval()
	{
		final int x = 200;
		//x=300;
		
		System.out.println(x); //200
		System.out.println(this.x);  //100
		
		System.out.println(super.x);
		
		super.sum(20, 30);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	
	
	
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substratcion between a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		//q2.sub(40, 30);
		//q2.sum(20, 30);
		//q2.qa1im();
		
		q2.printval();
		q2.sum(20, 30);
		
	}




	public void qa1im() {
		
		System.out.println("this is method of QA1I interface");
		
	}
	
}

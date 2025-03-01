package firstjavaPkg;

public class Calculations
{
	int a = 100;
	
	public void sum()
	{
		int a = 20;
		int b = 30;
		
		int c = a+b;
		System.out.println(c);
		System.out.println("Sum of a&b: " + c);
		
		
		System.out.println(a+b);  //50
		System.out.println("a" + "b");  //ab
		System.out.println("a" + b);  //a30
		
	}
	
	public void addition(int a, int b)
	{
		int z = a+b;
		System.out.println("addition of a&b: " + z);
	}
	
	
	

	public static void main(String[] args)
	{
		Calculations cal = new Calculations();
		//cal.sum();
		cal.addition(30, 40);
		cal.addition(cal.a, 50);

	}

}

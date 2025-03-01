package firstjavaPkg;

public class Calculation
{
	
	
	
	public Calculation(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public int sum()  //no input/no argument/no parameter
	{
		int a = 20;
		int b = 30;
		
		int c = a+b;
		System.out.println("Sum of a&b: " + c);
		return a;
	}
	
	public int addition(int a, int b)   //2 inputs/2 arguments/2 parameters
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
	}
	
	
	//20, 30, 40
	//x = 20+30
	//x+40

	public static void main(String[] args)
	{
		Calculation cal = new Calculation(20, 30);  //constructor will be automatically when we create object of the class
		
		 
		
		//cal.sum();
		
		
	//	int x = cal.addition(20, 30);
	//	cal.addition(x, 40);
	

	}

}

package firstjavaPkg;

 public class FirstJavaProgram
{

	int a = 10;  //global variable
	
	float b = 10.5f;
	char c = 'x';
	String d = "Java";
	boolean e = true;
	
	
	
	
	 public void firstmethod()
	{
		final int f = 100;  //local variable
		// f=200;
		
		System.out.println("This is java print statement");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("a");
		
		System.out.println(f);
		
	}
	
	 public void secondmethod()
	{
		
		//System.out.println(f);
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) 
	{
		FirstJavaProgram abc = new FirstJavaProgram();
		
		abc.firstmethod();
		System.out.println(abc.a);
		abc.secondmethod();
		
		
	}
	
	
	
	
	
}
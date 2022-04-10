package inheritance_singleLevel;

public class Inheritance_multiplication extends Inheritance_subtraction 
{

	int a=5;
	static int b=25;
	static int c=10;
	int mul=a*b;
	  
	public void multi()
	{
		
		System.out.println("Multiplication of nonstatic is "+mul);
	}
	
	public static void multi1()
	{
		int mul1=b*c;
		System.out.println("Multiplication of static is "+mul1);
		
	}
	
	
	
}

package assignment_Program;

public class Assg1 {

	public static void main(String[] args)
	{
		//this is program for forloop
		for(int a=0; a<=100; a++)
		{
		//System.out.println(a);
		}
		//System.out.println("###################");
//this is while loop program 
		int b=0;
		while (b<=100)
		{
		//	System.out.println(b);
			b++;
		}
		
		System.out.println("Java Program to Add Two Integer");
		int c=10;
		int d=20;
		int sum=c+d;
		System.out.println(sum);
		
		System.out.println("Java Program to Print an Integer");
		int z=10;
		System.out.println(z);
		
		Method1();
		Method2();
		Method3();
	}
  public static void Method1()
  {
	  System.out.println("Java Program to Multiply two Floating Point Numbers");
		float a=12.1234f;
		float b=2.2354f;
		System.out.println(a*b);
		
  }
  public static void Method2()
  {
	  System.out.println("Java Program to Compute Quotient and Remainder");
	  int a=200;
	  int q=(a/3); //we use backslash "/" for quotient 
	  int r=a%3; //we use percentage "%" for remainder
	  System.out.println(q);
	  System.out.println(r);
  }
  
  public static void Method3()
  {
	  System.out.println(" Java Program to Check Whether a Number is Even or Odd");
	 
	  
  }
}

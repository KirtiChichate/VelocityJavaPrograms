package assignment_Program;

public class Assig2 {

	public static void main(String[] args) {
		
     Method3();
      Method4();
     
	}

	public static void Method3()
	  {
		  System.out.println(" Java Program to Check Whether a Number is Even or Odd");
		 int a=200;
		 int b=a%2;
		  
		 if(b==0)
		 {
			 System.out.println("No is even");
		 }
		 else
		 {
			 System.out.println("No is odd");
		 }
		  
	  }
	
	public static void Method4()
	{
		for(int a=0; a<=100; a+=2)
		  {
			  System.out.println(a);
		  }
		  System.out.println("#########");
		  for(int b=1; b<=100; b+=2)
		  {
			  System.out.print(" "+b);
		  }
	}
	
}

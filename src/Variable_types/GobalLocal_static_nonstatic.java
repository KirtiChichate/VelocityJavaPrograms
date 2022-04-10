package Variable_types;

public class GobalLocal_static_nonstatic {
//this is static and nonstatic global and local variable program//
	 static int a=7; //static global variable//
	static int b=5;  //static global variable//
	int c=2;  //nonstatic global variable//
	
	
	public static void main(String[] args)
	{
		//for static method i dont need any object so i directly call this method by using call method syntax//
		addition();
		System.out.println("======================");
		//for nonstatic method i need to creat an object and then call for an method//
		GobalLocal_static_nonstatic obj1= new GobalLocal_static_nonstatic();
		obj1.subtraction();
		System.out.println("======================");
System.out.println("value of a is "+a);
System.out.println("value of b is "+b);
System.out.println("value of c is "+obj1.c);
System.out.println("==========================");
	}

	public static void addition()
	{
	int d=15;
	int sum=a+b+d; //i cant add here +c bcz c is a nonstatic variable and my method is static//
	System.out.println("Answer of addition method "+sum);
	}
	
	public void subtraction()
	// note-> static variable can run in====both static and nonstatic method//
	//note2-> nonstatic variable can run in=====only nonstatic method//
	{
		int e=21;
		int sub=e-a-b-c;
		System.out.println("Answer of subtraction method "+sub);
	}
	
	
}

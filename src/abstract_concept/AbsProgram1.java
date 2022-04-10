package abstract_concept;

public abstract class AbsProgram1
{
    
	static int a=10;
	int b=25;
	int sum=a+b;
	
	
	public static void main(String[]arg)
	{
		//AbsProgram1 obj= new AbsProgram1(); we cant creat object becz here one method is incomplete
		// due to that incomplete method that method make as a abstract method
		//and hence if in a class any abstract method is present then we need make that class is also as a abstract class
	}
	
	public void trial1() //this is a complete method with printing statement
	{
		System.out.println("This is a complete method with syso");
	}
	public void trial2() //this is also a complete method but here content is not available 
	{
		
	}
	public abstract void trial3();  //this is a incomplete method without any body so this method shows error
	
	

			
	public static void test1()
	{
		System.out.println("the value of a is "+a);
		
	}
	
	
	public void test2()
	{
		System.out.println("the value of sum is "+sum);
	}
	
}

package abstract_concept;

public class ConcProgram1 extends AbsProgram1
{
	int a=15;
	static int b=25;
	

	public static void main(String[] args)
	{
		ConcProgram1 obj= new ConcProgram1();
		obj.trial3();
		obj.test2();
		obj.trial1();
		obj.trial2();
		obj.trial4();
	    trial5();
		

	}
	
	//public void trial3();
	
		//System.out.println("This is incomplete method but complete in concrete class");
	

	public void trial4()
	{
		System.out.println(a);
	}
	
	public static void trial5()
	{
		System.out.println(b);
	}

	@Override
	public void trial3() 
	{
		System.out.println("this is incomplete method from AbsProgram");
		
	}
}

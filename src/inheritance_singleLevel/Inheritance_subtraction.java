package inheritance_singleLevel;

public class Inheritance_subtraction extends Inheritance_addition{
	
	static int a=25;
	static float b=30.12f;
	int c=50;
    static double sub=b-a;
	
	public static void subtrc()
	{
		System.out.println("subtraction of this is "+sub);
		
	}

	public void subtrc1()
	{
		int sub1=c-a;
		System.out.println("subtraction of this is "+sub1);
	}
	
}

package inheritance_hierarchical;

public class ProgramBaseClass
{
public ProgramBaseClass()  //this is user define constructor with nonstatic variable
{
	
		int a=12;
		 String Name="Kirti";
		 float b=12.1234f;
		System.out.println("The value of a is "+a);
		System.out.println("My name is "+Name);
		System.out.println("The value of float is "+b);
	
}

	
	//This is extra method to be included
	

	
	public void method1()
	{
		int a=12;
		int b=4;
		int sum=a+b;
		String Name="program";
		System.out.println("This is extra "+Name);
		System.out.println("Answer of sum is "+sum);
	}
}

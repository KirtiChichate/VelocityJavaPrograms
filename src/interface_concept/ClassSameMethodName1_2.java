package interface_concept;

public class ClassSameMethodName1_2 implements SameMethodName1,SameMethodName2 {
//this is implementation class with having same method name
	
	
	public static void main(String[] args) 
	{
		//Now call this all complete method which is comple in this implementation method
		//creat object of implementation class here
		ClassSameMethodName1_2 obj= new ClassSameMethodName1_2();
		obj.language();
		obj.marks();
		obj.myname();
		obj.city();
		//for calling static method city we need classname.methodname
		SameMethodName2.city();

	}

	@Override
	public void language() //this is different method in interface SameMethodName2
	{
		String Lag="Marathi";
		System.out.println("My language in SameMethodName2 is "+Lag);
		
	}

	@Override
	public void myname() //This is the same method name method from both interface 
	{
		//now call this method 1st from SameMethodName1 interface
		//syntax for calling ***interfacename.super.methodName****
		
		SameMethodName1.super.myname();
		SameMethodName2.super.myname();
		
	}

	@Override
	public void city() 
	{
		//this defination for method of same method name but that method is nonstatic in SameMethodName1
		String city="Pulgaon";
		System.out.println("My city name in SameMethodName1 is "+city);
	}

	@Override
	public void marks() 
	{
		int marks=95;
		System.out.println("My marks in SameMethodName1 is "+marks);
		
	}

}

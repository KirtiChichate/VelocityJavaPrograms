package access_modifier;

public class Class1 {
	
	int a=5;  //this global nonstatic variable---visibility---default---it visible in the same class,differernt and in the same package
	          //but not in another package means visibility----within the package only
	protected int b=10; //global nonstatic variable--visibility---protected---it visible in the same class,differernt and in the same package
	                  // but no in another package but this is possible by using"inheritance" and inheritance need to import this to another package
	private int c=15; //this global nonstatic variable---visibility---private---it is visible only within the same class
	public int d=20; //this global nonstatic variable---visibility--private--it is visible everywhere within same class,different class,same package,different package
	

	public static void main(String[] args) 
	{
		Class1 obj= new Class1(); //creat object for the same class
		//this is call for all nonstatic method
		obj.method2(); //this public access modifier
		obj.prog2(); //this protected access modifier
		obj.test2(); //this private access modifier
		obj.exmp2(); //this default access modifier
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//this is call for all static method
		Class1.exmp1(); //this default access modifier
		Class1.prog1(); //this protected access modifier
		Class1.test1(); //this private access modifier
		Class1.method1(); //this public access modifier
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		System.out.println("The value of a is "+obj.a);
		System.out.println("The value of b is "+obj.b);
		System.out.println("The value of c is "+obj.c);
		System.out.println("The value of d is "+obj.d);

	}
	
	public static void method1()
	{
		System.out.println("static method--visiblity--public--visible everywhere");
	}
	public void method2()
	{
		System.out.println("nonstatic method--visiblity--public--visible everywhere");
	}
	private static void test1()
	{
		System.out.println("static method--visiblity--private--visible only in same class");
	}
	private void test2()
	{
		System.out.println("nonstatic method--visiblity--private--visible only in same class");
	}
	protected static void prog1()
	{
		System.out.println("static method--visiblity--protected--visible only in same package but can access in another package using inheritance");
	}
	protected void prog2()
	{
		System.out.println("nonstatic method--visiblity--protected--visible only in same package but can access in another package using inheritance");			
	}
	static void exmp1()
	{
		System.out.println("static method--visiblity--protected--visible only in same package");
	}
	void exmp2()
	{
		System.out.println("static method--visiblity--protected--visible only in same package");
	}

}

package this_concept;

public class UseOfThis_prog1 {


	  int a=25;
	  static int z=15;
	  int sum=10+z;
	  static double add=12.145+25d;
	 static double y=z+154.123d;
     String Name="Kirti";
	 float b=12.1254f;
	static double d=15.12347d;
	
	public static void main(String[] args)
	{
		//calling static method
		test1();
		System.out.println("##################################################################");
		//calling nonstatic method
		UseOfThis_prog1 obj= new UseOfThis_prog1();
		obj.test2();
		System.out.println("#######################################################################");
        System.out.println("this is static variable calling in main method "+add);
		System.out.println("this is static variable calling in main method "+y);
		
		

	}
	
	public static void test1()
	{
		int a=13;
		int sub=20-a;
		String Name="pawan";
		double z=add+12.12d;
		System.out.println("value of static methods sub is "+sub);
		System.out.println("value of a is "+a);
		//in below this statement shows error becz we cant access static or nonstatic variable in static method by using "this" concept
	   // System.out.println("value of global variable a is "+this.a);
		System.out.println("name of static method content is "+Name);
		//in below this statement shows error becz we cant access static or nonstatic variable in static method by using "this" concept
	   // System.out.println("name of static method content is "+this.Name);
		System.out.println(z);
	}
	
	public void test2()
	{
		int a=5;
		float b=5.12334f;
		int sum=10+a;
		int mul=20*this.a;
		String Name=this.Name;
		double sub=10-b;
		System.out.println("Answer of mul is "+mul);
		System.out.println(sum);
		System.out.println("Answer of mix of sum "+this.sum);
		System.out.println(Name);
		System.out.println("value of float is "+this.b);
		System.out.println("value of global vaiable a is "+a);
		System.out.println("name of static method content is "+this.Name);
		System.out.println(b);
		System.out.println(sum);
		
		System.out.println(sub);
		
	}

}

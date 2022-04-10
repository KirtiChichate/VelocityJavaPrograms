package super_concept;

public class UseOfSuper_prog2 extends UseOfSuper_prog1 {

	int a=12;
     String city="wardha";
	char alpha='c';
	
	
	
	public static void main(String[] args)
	{
	//creat object for another class prog1 but u extends prog1 class to prog2 then u can creat class of prog2 and call method of class prog1
		UseOfSuper_prog2 obj= new UseOfSuper_prog2();
		obj.test1(); //this method is from class prog1
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		obj.method2();
		
		//you cant access super and this keyword in main also also directly like this.global variable name
		//or super.global variable name becz this is also having "static name included 
		//static means only having one replica means it repeated at once only
		//System.out.println("global variable from another class prog1 city name is "+super.city); this is not access

		
		
		
	}

	public void method2()
	{
		int a=3;
		String city="pune";
		char alpha='d';
		System.out.println("local value of a is "+a);
		System.out.println("local name of city is "+city);
		System.out.println("local character is "+alpha);
		System.out.println("global variable from another class prog 1 a is "+super.a);
		System.out.println("global variable from same class is "+this.a);
		System.out.println("global variable from another class prog 1 city is "+super.city);
		System.out.println("global variable from another class prog 1 alpha is "+super.alpha);
		System.out.println("global variable from same class city is "+this.city);
		System.out.println("global variable from same class city is "+this.alpha);
		
		
	}
	
	public static void method3()
	{
		int a=56;
		System.out.println(a);
		//System.out.println(super.a); //u cannot use super in a static method //
		
//so the use of "this" and "super" keyword is not access 
	}
}

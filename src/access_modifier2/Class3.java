package access_modifier2;

import access_modifier.Class1;

public class Class3 extends Class1{

	public static void main(String[] args) 
	{
		//this is nonstatic method calling with object
		Class1 obj= new Class1();
		obj.method2(); //this public access modifier
		
		//now for protected access modifier we need to another object of this class3
		Class3 obj2= new Class3();
		obj2.prog2(); //this protected access modifier
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		//this is static method 
		Class1.method1(); //this public access modifier
		Class1.prog1(); //this protected access modifier
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println("The value of b is "+obj2.b); // it need to call by 2nd object that created from this class
		System.out.println("The value of d is "+obj.d);
		
		
	}

}

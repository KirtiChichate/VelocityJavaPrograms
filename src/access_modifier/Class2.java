package access_modifier;

public class Class2 {

	public static void main(String[] args) {
		//this is the nonstatic methods from class 1
		Class1 obj= new Class1();
		obj.exmp2(); //this default access modifier
		obj.prog2(); //this protected access modifier
		obj.method2(); //this public access modifier
		//obj.test2();----this is private nonstatic method
		System.out.println("#####################################################");
		
		
		
		//this is the static methods from class 1
		Class1.exmp1(); //this default access modifier
		Class1.prog1(); //this protected access modifier
		Class1.method1(); //this public access modifier
		//Class1.test1(); //this is private access modifier
		System.out.println("############################################################");
		
		
		System.out.println("The value of a is "+obj.a);
		System.out.println("The value of b is "+obj.b);
		//System.out.println("The value of c is "+obj.c); this is private statement
		System.out.println("The value of d is "+obj.d);

	}

}

package constructor_study;

public class constructor_userdefined_declaration 
{
//declaration of datatype and variable in between class//
	int a;  //nonstatic variable//
	int b;   //nonstatic variable//
	int c;   //nonstatic variable//
	float d;  //nonstatic variable//
	static char e;  //static variable//
	
	
	
	public constructor_userdefined_declaration()
	{
	//initialization value of that variable in between constructor//
	System.out.println("This is user defined nonparameter constructor");	
		a=5;
		b=10;
		c=a+b;
		d=1.23f;
		e='D';
		
	}
	
	public static void main(String[] args)
	{
	//here now crete object to run constructor//
		constructor_userdefined_declaration obj2= new constructor_userdefined_declaration();
		System.out.println("value of a is====== "+obj2.a);
		System.out.println("value of b is======= "+obj2.b);
		System.out.println("value of c is======= "+obj2.c);
		System.out.println("value of d is======= "+obj2.d);
		System.out.println("value of e is======= "+e);

	}

}

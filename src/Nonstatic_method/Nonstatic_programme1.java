package Nonstatic_method;

public class Nonstatic_programme1 {

	public static void main(String[] args) {
		String city;
		String district;
		String state;
		 
		city="Nagpur";
		district="Wardha";
		state="Maharashtra";
		System.out.println("My city is "+city);
		System.out.println("My district name is "+district);
		System.out.println("My state is "+state);
		//creat object syntax- classname objectname= new classname//
		Nonstatic_programme1 riv= new Nonstatic_programme1();
		//creat method syntax- objectname.methodname//
		riv.river();
		
		//for 2nd //
		riv.mydetails();
		
		//creat object from another class syntax- classname objectname= new classname//
		Nonstatic_programme2 com= new Nonstatic_programme2();
		//creat method for this syntax- objectname.methodname//
		com.company();
		
		
	}

	public void river()
	{
		
	System.out.println("ganga is a river");	
	}
	
	public void mydetails()
	{
	int a,b,c,d;
		a=2;
		b=4;
		c=a+b;
		d=a*b;
		System.out.println("value of c is "+c);
		System.out.println("value of d is "+d);
			
	}
	
	
	
	
	
	
	
	
	
	
	
}

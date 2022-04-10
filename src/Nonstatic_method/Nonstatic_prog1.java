package Nonstatic_method;

public class Nonstatic_prog1 {

	public static void main(String[] args) {
		int a,b,c;
		float d;
		a=4;
		b=5;
		c=a+b;
		d=1.23f;
		System.out.println("value of c is "+c);
		System.out.println("value of d is "+d);
		
		Nonstatic_prog1 method= new Nonstatic_prog1();
		method.test1();
		method.test2();
		
		
		
		Nonstatic_prog2 method2= new Nonstatic_prog2();
		method2.test3();

	}

	public void test1()
	{
		int e;
		double f;
		e=57;
		f=22.23d;
		
		System.out.println("value of e is "+e);
		System.out.println("value of f is "+f);
		
	}
	public void test2() 
	{
	char position ;
	position='A';
	 System.out.println("my character shows "+position);
	}
	
	
}

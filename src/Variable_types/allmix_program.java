package Variable_types;

public class allmix_program {

	int a; 
	static int b;
	char c;
	String d;
	float e;
	double f;
	
	
	public static void main(String[] args)
	{
		allmix_program obj1= new allmix_program();
		obj1.execution();
		System.out.println("=================================");
        
		
		allmix_program obj2= new allmix_program();
		obj2.execution2(5, 6, 'A', 1.23);

	}

	public void execution()
	{
		a=10;
		b=5;
		c='A';
		d="Kirti";
		e=2.1333333f;
		f=45.42235688d;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println("value of grade is "+c);
		System.out.println("my name is "+d);
		System.out.println("value of e is "+e);
		System.out.println("value of f is "+f);
	}
	
	public void execution2(int num, int num1, char num2, double num3)
	{
		a=num;
		b=num1;
		c=num2;
		f=num3;
		double num4=a+b+f;
		System.out.println("value of double is "+num4);
		System.out.println("num2 defines character "+c);
	}
	
	
	
}

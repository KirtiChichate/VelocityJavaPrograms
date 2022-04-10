package Constructor_withparameter;

public class study2 {

	int a;
	int b;
	float c;
	double d;
	
	
	
	public static void main(String[] args)
	{
	study2 obj= new study2();
	obj.addmulti();
		
		study2 obj1= new study2(10);
		obj1.addmulti();
		
		study2 obj2= new study2(5, 15);
		obj2.addmulti();
		
		study2 obj3= new study2(7, 20, 1.2f);
		obj3.addmulti();
		
		study2 obj4= new study2(12, 7, 2.1f, 5.232d);
		obj4.addmulti();

	}

	public study2()
	{
		System.out.println("this is nonparameter value is running");
		a=2;
		b=4;
		c=1.2f;
		d=2.44d;
		
	}
	
	public study2(int num)
	{
		a=num;
		
		System.out.println("this is parameter with single ");
	}
	
	public study2(int num, int num1)
	{
		System.out.println("this is parameter with double ");
		a=num;
		b=num1;
			
	}
	
	public study2(int num, int num1, float num2)
	{
	System.out.println("this is parameter with triple");	
		a=num;
		b=num1;
		c=num2;
		
	}
	
	public study2(int num, int num1, float num2, double num3)
	{
	System.out.println("this is parameter with 4 ");	
		a=num;
		b=num1;
		c=num2;
		d=num3;
		
	}
	  
	public void addmulti()
	{
		double value=(a+b)*(c+d);
		System.out.println("Answer is "+value);
		
	}
	
	
}

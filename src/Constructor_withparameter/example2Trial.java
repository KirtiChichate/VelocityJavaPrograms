package Constructor_withparameter;

public class example2Trial
{

	int a;
	int b;
	int c;
	float d;
	double e;
	
	
	public static void main(String[] args)
	{
	example2Trial obj= new example2Trial();//zero parameter
	obj.method();
System.out.println("======================");

     example2Trial obj1= new example2Trial(4, 6);
     obj1.method();
     System.out.println("======================");
  

     example2Trial obj2= new example2Trial(5, 7, 8);
     obj2.method();
     System.out.println("==================");

     example2Trial obj3= new example2Trial(2, 3, 10, 1.258945f);
     obj3.method();
     System.out.println("=========================");

     example2Trial obj4= new example2Trial(5, 6, 7, 2.132465f, 5.448764656548d);
     obj4.method();
	}

	
	public example2Trial()
	{
		a=4;
		b=5;
		c=6;
		d=2.256784635f;
		e=4.12345678951246d;
		System.out.println("Answer of zero parameter is ");
	}
	
	public example2Trial(int no, int no1)

	{
	a=no;
	b=no1;
	System.out.println("Answer of two parameter is ");
	}

	public example2Trial(int no, int no1, int no2)
	{
	a=no;
	b=no1;
	c=no2;
	System.out.println("Answer of three parameter is");
	}
	
	public example2Trial(int no, int no1, int no2, float no3)
	{
		a=no;
		b=no1;
		c=no2;
		d=no3;
		System.out.println("Answer of four parameter is");
	}
	
	public example2Trial(int no, int no1, int no2, float no3, double no4)
	{
		a=no;
		b=no1;
		c=no2;
		d=no3;
		e=no4;
	}
	
	public void method()
	{
		int value1=a;
		int value2=b;
		int value3=c;
		float value4=d;
		double value5=e;
		
		double value6=value1+value2+value3+value4+value5;
		System.out.println("addition of this is "+value6);
		double value7=value1*value2*value3*value4*value5;
		System.out.println("multiplication of this is "+value7);
		//addition=value1+value2+value3+value4+value5;
		//sum=a+b+c+d+e;
		//multiplication=value1+value2+value3+value4+value5
	}
	
	
	
	
	
}

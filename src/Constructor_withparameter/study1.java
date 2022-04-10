package Constructor_withparameter;

public class study1 {

	int a;
	int b;
	int c;
	
	public static void main(String[] args)
	{
	study1 cons= new study1();
	cons.execution();
	
	
	study1 cons1= new study1(25);
	cons1.execution();
	
	study1 cons2= new study1(10, 20);
	cons2.execution();
	
	
	study1 cons3= new study1(11, 21, 31);
	cons3.execution();	
	
	}

	public study1() //user defined nonparameter constructor//
	{
	System.out.println("This is user defined nonparameter constructor is running");
	a=5;
	b=25;
	c=10;
	}
	
	
	public study1(int number)//user defined single nonparameter constructor//
	{
		System.out.println("single nonparameter is running");
		a=number;
	}
	
	
	public study1(int number, int number1) //user defined double nonparameter constructor//
	{
	System.out.println("double nonparameter is running");	
		a=number;
		b=number1;
	}
	
	
	public study1(int number, int number1, int number2)
	{
	System.out.println("triple nonparameter is running");	
		a=number;
		b=number1;
		c=number2;
	}
	
	public void execution()
	{
		int add=a+b+c;
		System.out.println("addition is executed "+add);
	}
	
	
	
	
}

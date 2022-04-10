package Constructor_withparameter;

public class exampleTrial 
{

	int a;
	char b;
	String c;
	float d;
	double e;
	
	
	
	public static void main(String[] args)
 {
	exampleTrial obj= new exampleTrial(); //in this you need to write constructor which one you have to like with parameter or with single parameter etc//
	obj.method(); //here you have to objectname.methodname not write the objectname.constructorname//
	System.out.println("=================================");
	exampleTrial obj1= new exampleTrial(29, 'b', "Neha");
	obj1.method();
	System.out.println("=======================================");
	exampleTrial obj2= new exampleTrial(31, 'a', "pawan", 6.1f, 12.123d);
	obj2.method();
			
	

	}

	public exampleTrial()
	{
	a=26;
	b='g';
	c="kirti";
	d=5.7f;
	e=11.62d;
	
	}
	
	public exampleTrial(int per1, char per2, String per3)
	{
		System.out.println("this is 3 parameter program is running");
		a=per1;
		b=per2;
		c=per3;
		
	}
	
	public exampleTrial(int per1, char per2, String per3, float per4, double per5)
	{
		System.out.println("this is 5 parameter program is running");
		a=per1; //what is diff if suppose i write per1=a it cant shows value but if i write a=per1 it gives value//
		b=per2;
		c=per3;
		d=per4;
		e=per5;
	}
	
	
	
	public void method()
	{
	int value1=a;
	System.out.println("My age is===== "+value1);
	char value2=b;
	System.out.println("My blood group is===== "+value2);
	String value3=c;
	System.out.println("My name is====== "+value3);
	float value4=d;
	System.out.println("My height is======= "+value4);
	double value5=e;
	System.out.println("My package is======= "+value5);
	}
}

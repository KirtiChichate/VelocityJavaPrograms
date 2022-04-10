package polymorphisms_methodLoading;

public class Program1 {
//write program for execution of polymorphisms concept
	
	public static void main(String[] args) 
	{
		//now for use of polymorphisms we need to creat an object 1st 
		Program1 obj= new Program1();
				
	//now give the declaration by calling objectname.methodname
				obj.method(); //method with zero parameter and this is method declaration
		        obj.method(12, 12.1235f);  //method with two parameter and this is method declaration
                obj.method(5.123f, 52.123d, "Kirti"); //method with three parameter and this is method declaration
		        method(12, 1.23f, 12.4587d, 'A', "Nagpur");
		        
		       // when we have same method name but with different parameter then the combination of method declaration and method definition is called as a ploymorphisms
		        // and polymorphisms is nothing but method overloading
	}
	
	public void method() //method name is same but its parameter is zero
	{ //this is method definition
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}

	public void method(int a, float b) //method name is same but its parameter is two
	{ //this is method definition
		float mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	
	public void method(float a, double b, String name) //method name is same but its parameter is three with different data types
	{ //this is method definition
		double add=a+b;
		System.out.println("Addition is "+add);
		System.out.println("My name is "+name);
	}
	public static void method(int a, float b, double c, char rank, String city)
	{ //this is method definition
		double mix=(a/b)+c;
		System.out.println("Value of mix is "+mix);
		System.out.println("My rank is "+rank);
		System.out.println("My city name is "+city);
	}
}

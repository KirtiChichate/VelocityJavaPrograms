package generalization;

public class Gensubclass1 implements GenSuperClass_ {

	@Override
	public void Addition() {
		int a=10;
		int b=25;
		double c=15.1234;
		System.out.println("Value of addition is "+(a+b+c));
		
	}

	@Override
	public void Employee_details() {
		String Name="Ramesh";
		String City="Pulgaon";
		char Emp_id='A';
		System.out.println("Employee details are "+Name +"....."+City +"..."+Emp_id);
		
	}

	@Override
	public void Multiplication() {
		
		int a=54;
		int b=10;
		System.out.println("Value of Multiplication is "+(a*b));
	} 
	
	public void Class1()
	{
		System.out.println("This is a extra method from Gensublass1");
	}

}

package generalization;

public class Gensubclass3 implements GenSuperClass_ {

	@Override
	public void Addition() {
		
		int a=15;
		float b=25.125f;
		double c=35.1234;
		System.out.println("Value of addition is "+(a+b+c));
	}

	@Override
	public void Employee_details() {
		String Name="Pawan";
		String City="Nagpur";
		char Emp_id='C';
		System.out.println("Employee details are "+Name +"..."+City +"...."+Emp_id);
		
	}

	@Override
	public void Multiplication() {
		int a=24;
		int b=60;
		float c=5;
		System.out.println("Value of Multiplication is "+(a*b+c));
		
	}

	public void Class3()
	{
		System.out.println("This is a extra method from Gensublass3");
	}
}

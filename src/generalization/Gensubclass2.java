package generalization;

public class Gensubclass2 implements GenSuperClass_{

	@Override
	public void Addition() {
		int a=10;
		float b=5.123f;
		System.out.println("Addition of this is "+(a+b));
		
	}

	@Override
	public void Employee_details() {
		String Name="Mangla";
		String City="Pulgaon";
		char Emp_id='B';
		System.out.println("Employee details are "+Name +"..."+City +"...."+Emp_id);
		
	}

	@Override
	public void Multiplication() {
		int a=55;
		int b=20;
		System.out.println("Value of Multiplication is "+(a*b));
		
	}
	
	public void class2()
	{
		System.out.println("This is a extra method from Gensublass2");
	}

}

package Method_parameter;

public class parameter_prog1 {

	public static void main(String[] args)
	{
		System.out.println("I am writing method parameter programme");
		
		employeeinfo("Kirti", 01, 'A', 50000.12, false);
		
		employeeinfo("Neha", 10, 'b', 52000.56, false);
		
		employeeinfo("pawan", 02, 'c', 55000.12, false);
		
	}

	public static void employeeinfo(String Name, int ID, char position, double payment, boolean present)
	{
	
		
		System.out.println("Name of Employee........ "+Name);
		
		System.out.println("Employee Id....... "+ID);
		
		System.out.println("position of Employee........ "+position);
		
		System.out.println("payment of Employee........ "+payment);
		
		System.out.println("Employee is present...... "+present);
		
		
		
		
	}
	
	
	
	
}

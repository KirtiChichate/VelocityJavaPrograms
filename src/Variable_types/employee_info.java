package Variable_types;

public class employee_info {

	//name//
	//employee id//
	//designation//
	//position//
	//salary//
	String employee_name;
	int employee_id;
	String employee_designation;
	char employee_position;
	float employee_salary;
	boolean employee_attendance;
	
	public static void main(String[] args) 
	{
		
		
	}

	public void details()
	{
	System.out.println("*************************************");
	System.out.println("Name of the employee is "+employee_name);
	System.out.println("Id of the employee is "+employee_id);
	System.out.println("Designation of employee "+employee_designation);
	System.out.println("position of employee "+employee_position);
	System.out.println("salary of employee "+employee_salary);
	System.out.println("Attendance of employee "+employee_attendance);
	System.out.println("*************************************");
		
	}
	
	
	
}

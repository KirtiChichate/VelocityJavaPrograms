package Method_parameter;

public class parameter_prog2 {

	public static void main(String[] args) {
		System.out.println("Detail information of students");

		info1(01, "Kirti", 10, "Maths", 75.45);
		info1(02, "neha", 011, "english", 85);
		
		//call object//
		parameter_prog2 xyz= new parameter_prog2();
		//call method//
		xyz.info2(56, "Mangla", 5.6);
		xyz.info2(86, "Ramesh", 5.8);
		xyz.info2(98, "pawan", 6.0);
		
		
				
	}

	public static void info1(int Rollno, String Name, int standard, String subject, double attendance)
	{
		System.out.println("Student roll no ------- "+Rollno);
		System.out.println("student name--------- "+Name);
		System.out.println("student subject------ "+subject);
		System.out.println("student attendance-----"+attendance);
		
		
	}
	
	public void info2(int weight, String Name, double hight)
	{
	    System.out.println("weight of person..... "+weight);	
		System.out.println("Name of person..... "+Name);
		System.out.println("Height of person.... "+hight);
	}
	
	
	
}

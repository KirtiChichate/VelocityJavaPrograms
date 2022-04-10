package Variable_types;

public class employee_infoByName {

	public static void main(String[] args) {
	//create an object for this//
		employee_info Kirti= new employee_info();
		 //creat an object by entering variable parameters//
		Kirti.employee_name="Kirti Chichate";
		Kirti.employee_id= 1;
		Kirti.employee_designation="software engg";
		Kirti.employee_position='T';
		Kirti.employee_salary= 65000.123f;
		Kirti.employee_attendance=true;
		System.out.println("######################################");
		
		employee_info Pawan= new employee_info();
		Pawan.employee_name="Pawan Chichate";
		Pawan.employee_id= 2;
		Pawan.employee_designation="software engg D";
		Pawan.employee_position='D';
		Pawan.employee_salary=70000.1254f;
		Pawan.employee_attendance=false;
		
		//now call that perticular method using this parameter assigning//
		Kirti.details();
		
		System.out.println("=========================================");
		Pawan.details();
		
		
		
		

	}

}

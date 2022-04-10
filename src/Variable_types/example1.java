package Variable_types;

public class example1 {

	static String Hospital_Name="wockheart";
	String patient_Name;
	char patient_bloodgroup;
	int patient_age;
	float patient_treatment_money;
	double patient_oxygenlevel;
	
	
	
	public static void main(String[] args) 
	{
		example1 Aarya= new example1();
		Aarya.patient_Name="Aarya shashtri";
		Aarya.patient_bloodgroup='A';
		Aarya.patient_age=24;
		Aarya.patient_treatment_money=50000.23f;
		Aarya.patient_oxygenlevel=92.23256565d;
		System.out.println("***************************");
		Aarya.details();
		
		example1 ajit= new example1();
		ajit.patient_Name="Ajit patil";
		ajit.patient_bloodgroup='b';
		ajit.patient_age=56;
		ajit.patient_treatment_money=56.245465f;
		ajit.patient_oxygenlevel=97.123d;
		System.out.println("*****************************************");
ajit.details();
	}

	public void details()
	{
		System.out.println("Name of hospital is "+Hospital_Name);
		System.out.println("Name of patient is "+patient_Name);
		System.out.println("bloodgroup of patient is "+patient_bloodgroup);
		System.out.println("Age of patient is "+patient_age);
		System.out.println("treatment money he need is "+patient_treatment_money);
		System.out.println("oxygen level of patient is "+patient_oxygenlevel);
		
	}
	
	
	
	
}

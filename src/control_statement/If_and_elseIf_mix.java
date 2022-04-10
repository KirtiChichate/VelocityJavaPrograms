package control_statement;

public class If_and_elseIf_mix {

	public static void main(String[] args) {
		String Name="kirti";
		int Age= 26;
		char bloodgroup= 'A';
		if (Name!="komal" )
		{
			System.out.println("Its my data");
		}
		else
		{
			System.out.println("its not my data");
		}
		if (Age<=26)
		{
			System.out.println("I am not applicable for this job");
		}

		else if (Age==26)
		{
			System.out.println("i am applicable for this job");
		}
		if (bloodgroup!='b')
		{
			System.out.println("Its not shows my bloodgroup");
		}
		else 
		{
			System.out.println("Its my blood group");
		}
	}

}

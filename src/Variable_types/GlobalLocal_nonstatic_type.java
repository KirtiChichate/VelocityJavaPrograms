package Variable_types;

public class GlobalLocal_nonstatic_type {

	int a=10; //global nonstatic variable//
	int b=6;  //global nonstatic variable//
	int c=4;  //global nonstatic variable//
	
	public static void main(String[] args) 
	{
		//for nonstatic method creat an object//
		//syntax- classname object= new classname//
		GlobalLocal_nonstatic_type obj= new GlobalLocal_nonstatic_type();
		//to call object for any method syntax- objectname.methodname//
		obj.addition();
		//for in same class we dont need to creat another object we can call another method with the same object//
		obj.subtraction();

	}

	public void addition()  //nonstatic method//
	{
		int d=8; //local nonstatic variable//
		int sum=a+b+d; //local nonstatic variable//
		System.out.println("Addition of this method is "+sum);
	}
	
	public void subtraction()
	{
		int e=15; //local nonstatic variable//
		int sub=e-a-c; //local nonstatic variable//
		System.out.println("subtraction of this is "+sub);
		
	}
	
	
	
	
	
	
}

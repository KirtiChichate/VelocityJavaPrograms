package casting;

public class Primitive_Casting {

	public static void main(String[] args)
	{
		System.out.println("#######This is a code for Implicit casting########");
		//This is implicit primitive casting
		int a=10; //this is lower data type means int is having size 4byte
		System.out.println("This is value of lower data type a "+a);
		double b=a; //this is higher data type means double is having size 8byte
		System.out.println("This is a value of higher data type b "+b);

		//this is explicit primitive casting
		System.out.println("#######This is a code for explicit casting########");
		double c=10.2358; //this is higher data type means double is having size 8byte
		System.out.println("This is a value of higher data type c "+c);
		//int d=c;  this is not possible at the time of explicit casting
		// becz it cant be convert lower data type to hinghet for this we need to wrute like below
		int d=(int) c;
		System.out.println("This is the valie of lower data type d "+d);
		
	}

}

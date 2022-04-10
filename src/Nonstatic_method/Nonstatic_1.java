package Nonstatic_method;

public class Nonstatic_1 {

	public static void main(String[] args) {
		//creat simple test first//
		
		
		System.out.println("I am creating basic programme for nonstatic");
		//creat object by adding syntax- classname objectname= new classname()//
		//Here object name i have to creat now and i can take anything as a object//
		
		Nonstatic_1 object= new Nonstatic_1();
		
		//creat nonstatic method syntax- objectname.methodname//
		
		object.comment1();
		
		//now for writing second comment our object is same becz i am writing this in same class but method name changes for second comment//
		// now i dont need to creat object only call nonstatic method here//
		
		object.comment2();
		
		
		
		//now creat object of another class- nonstatic_2 for this class//
		Nonstatic_2 object2= new Nonstatic_2();
		//now creat method for another class//
		object2.comment3();
		//in this class one another comment so for this creat one more method only//
		//object is already created//
		object2.comment4();
		
		
		
		
				
		
		
		

	}
//write nonstatic comment//
	public void comment1()
	{
	System.out.println("Nonstatic comment1 is running");	
		
	}
	
	
	public void comment2()
	{
		
		System.out.println("Nonstatic comment2 is running");
	}
	
	
	
	
	
}

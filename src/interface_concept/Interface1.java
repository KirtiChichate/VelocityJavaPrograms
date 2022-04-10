package interface_concept;

public interface Interface1
{
	int a=20; //This variable is in interface so its by default static and final
	
	
	void test(); //This method in interface is by default public and abstract 
	             //u dont need to make or write public or anything else its bydefault public
	             //and we make it interface so bydefault this method is abstract
	void test1();
	
	//now creat an object of this but u cant creat object of interface
	     
	//  Interface1 obj= new Interface1(); 

}

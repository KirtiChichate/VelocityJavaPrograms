package interface_concept;

public interface Interface2_ extends Interface1
{

	void test3(); //This method in interface is by default public and abstract 
    //u dont need to make or write public or anything else its by default public
    //and we make it interface so by default this method is abstract
	
	void test4();
	
	
	// i extends interface1 in interface2_ so all the methods from interface1 is in now interface2_
	
	//so to complete this methods from both interface i need one class which implements this interface2_ 
	
}

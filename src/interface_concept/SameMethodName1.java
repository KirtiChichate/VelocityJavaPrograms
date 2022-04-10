package interface_concept;

public interface SameMethodName1
{

	
	default void myname() //this method i make as a default in this interface SameMethodName1
	{
		String Name="Kirti";
		System.out.println("My name in SameMethodName1 is "+Name);
	}
	
	void city(); //this method i make as a static in another interface SameMethodName2 
	             //And here this method is nonstatic so no need to make static like we do for default
	
	void marks();
}

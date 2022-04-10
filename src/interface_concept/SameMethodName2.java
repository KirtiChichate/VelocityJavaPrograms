package interface_concept;

public interface SameMethodName2
{

    default void myname() //this method i make as a default in this interface SameMethodName2
    {
    	String Name="Pawan";
    	System.out.println("My name in SameMethodName2 is "+Name);
    }
	
	static void city() //this method i make as a static in this interface SameMethodName2
	{
		String City="Nagpur";
		System.out.println("My city in SameMethodName2 is "+City);
	}
	
	void language();
	
}

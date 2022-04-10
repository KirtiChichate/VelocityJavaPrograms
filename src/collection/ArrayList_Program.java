package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Program {

	public static void main(String[] args) {
		
		//Create class of Arraylist and object of arraylist
		ArrayList AL= new ArrayList<>();
	
		//Call the method of arraylist class like if suppose we want to add any array then use add
		//my array is [My Name is Kirti 30.14 A null String]
		
		AL.add("My");
		AL.add(1, "Name");
		AL.add("is");
		AL.add("Kirti");
		
		System.out.println(AL);
		
		AL.add(30.14);
		AL.add('A');
		System.out.println(AL);
		System.out.println(AL.size());
		
		System.out.println(AL.isEmpty());
		System.out.println(AL.contains("is"));
		AL.remove(4);
		AL.add(null);
		AL.add("String");
		System.out.println(AL.size());
		System.out.println(AL.get(1));
		
		System.out.println("=========By using For Loop==========");
		//Here we use size insted of length while declaring in arraylist 
		for(int i=0; i<=AL.size()-1; i++ )
		{
			System.out.println(AL.get(i));
		}

		
		System.out.println("=========By using Iterator with while Loop==========");
		Iterator ITE=  AL.iterator();
	    while(ITE.hasNext())
	    {
	    	System.out.println(ITE.next());
	    	
	    }
	    
	    System.out.println("=========By using Enhanced/each for Loop==========");
		//here we use combine datatypes so we r going to use object return type
	    
	    for(Object OBZ:AL)
	    {
	    	System.out.println(OBZ);
	    }
		
	    
	    
	    
	    
	    //CReate new arrays
	    ArrayList New= new ArrayList<>();
	    New.add("I");
	    New.add("Am");
	    New.add("Printing");
	    New.add("New");
	    New.add("Array");
	    New.add("For");
	    New.add("ListIterator");
	    System.out.println(New.size());
	    
	    
	    System.out.println("=========By using listIterator for Loop==========");
		ListIterator LT = New.listIterator();
		while(LT.hasNext())
		{
			System.out.println(LT.next());
		}
		
	}

}

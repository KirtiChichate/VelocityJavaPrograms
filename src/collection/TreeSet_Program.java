package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Program {

	public static void main(String[] args) {
		
		TreeSet TS= new TreeSet();
		//Treeset store only Homogeneous data
		
		TS.add("THOUGHT");
		TS.add("of");
		TS.add("The");
		TS.add("day");
		TS.add("STAY");
		TS.add("ALWAYS");
		TS.add("HAPPY");
		TS.add("HEALTHY");
		
	//	TS.add(123);
	//	TS.add(8.123);
	//	TS.add('A');
		TS.add("HAPPY");
	//	TS.add(null);
		//hashset show random array
		
		System.out.println(TS);
		System.out.println(TS.size());
		System.out.println(TS.contains("Happy"));
		
		System.out.println(TS.pollFirst());  //Retrieves and removes the first (lowest) element,or returns null if this set is empty
		
		System.out.println(TS.pollLast());  //Retrieves and removes the last (highest) element,or returns null if this set is empty.
		System.out.println(TS);
		System.out.println(TS.size());
		
		TS.add("New");
		
		System.out.println("-----Using each for loop------");
		for(Object obj:TS)
		{
			System.out.println(obj);
		}

		
		System.out.println("-----Using while Iterator loop------");
		Iterator It= TS.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}  
		
/*		for(int i=0; i<=TS.size()-1; i++)
		{
			System.out.println(TS.getClass());
		}     This loop is not followed in treeset and all the implementation class of set */
	}

}

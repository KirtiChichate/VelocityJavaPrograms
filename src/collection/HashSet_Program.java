package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Program {

	public static void main(String[] args) {
		
       HashSet HS= new HashSet();
		
		HS.add("STAY");
		HS.add("ALWAYS");
		HS.add("HAPPY");
		HS.add(123);
		HS.add(8.123);
		HS.add('A');
		HS.add("HAPPY");
		HS.add(null);
		//hashset show random array
		
		System.out.println(HS);
		System.out.println(HS.size());
		System.out.println(HS.contains(123));
		
		HS.remove(123);
		HS.add("New");
		
		System.out.println("-----Using each for loop------");
		for(Object obj:HS)
		{
			System.out.println(obj);
		}

		
		System.out.println("-----Using while Iterator loop------");
		Iterator It= HS.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}

	}

}

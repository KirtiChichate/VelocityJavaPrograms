package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Program {

	public static void main(String[] args) {
	
		LinkedHashSet LHS= new LinkedHashSet();
		
		LHS.add('A');
		LHS.add("YOU");
		LHS.add("ARE");
		LHS.add("ONLY");
		LHS.add("ONE");
		LHS.add(124);
		LHS.add(1.132);
		LHS.add(null);
		LHS.add("ONE");
		
		System.out.println(LHS);
		System.out.println(LHS.size());
		System.out.println(LHS.contains(123));
		
		LHS.remove(124);
		LHS.add("New");
		
		System.out.println("-----Using each for loop------");
		for(Object obj:LHS)
		{
			System.out.println(obj);
		}

		
		System.out.println("-----Using while Iterator loop------");
		Iterator It= LHS.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}

	}

}

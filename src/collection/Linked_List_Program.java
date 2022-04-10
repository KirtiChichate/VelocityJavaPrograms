package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_Program {

	public static void main(String[] args) {
	
		LinkedList LL= new LinkedList();
		
		LL.add("Linked");
		LL.add("List");
		LL.add("Is");
		LL.add("Printing");
		LL.add(123);
		LL.add(4.12);
	 
		System.out.println(LL);
	
		System.out.println(LL.size());
		System.out.println(LL.isEmpty());
		System.out.println(LL.indexOf("Is"));
		
		LL.removeLast();
		LL.add("remove");
		LL.add("hiii");
		LL.add("Happy");
		System.out.println(LL.size());
		
		System.out.println("***** Using each for loop******");
		for(Object obj:LL)
		{
			System.out.println(obj);
		}
		
		
		System.out.println("***** Using Iterator loop******");
		Iterator IT= LL.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
	

	}

}

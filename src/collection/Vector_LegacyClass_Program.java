package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_LegacyClass_Program {

	public static void main(String[] args) {
		
		Vector vec= new Vector();
		
		vec.add("pune");
		vec.add(123);
		vec.add(2, 'a');
		vec.add(null);
		vec.add("Nagpur");
		vec.add(54.1);
		vec.add("pune");
		vec.add(null);
		
		
		
		
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec.isEmpty());
		System.out.println(vec.contains("pune"));
		System.out.println(vec.indexOf(null));
		System.out.println(vec.get(5));
		vec.remove(3);
		vec.add("class");
		vec.add(145);
		vec.add('d');
		
		System.out.println("######## using each for loop#########");
		for(Object obj:vec)
		{
			System.out.println(obj);
		}
		
		
		System.out.println("#######Using Iterator##########");
		Iterator ITR= vec.iterator();
		while(ITR.hasNext())
		{
			System.out.println(ITR.next());
		}
		
		System.out.println("###### Using List iteraor########");
		ListIterator LT= vec.listIterator();
		while(LT.hasNext())
		{
			System.out.println(LT.next());
		}
		
		System.out.println("###### Using enumeration######");
		Enumeration EM= vec.elements();
		while(EM.hasMoreElements())
		{
			System.out.println(EM.nextElement());
		}  
	}

}

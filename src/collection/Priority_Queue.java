package collection;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		PriorityQueue PQ= new PriorityQueue();
		//its function is same like treeset class
		PQ.add("kIRTI");
		PQ.add("jai");
		PQ.add("ALWAYS");
		PQ.add("HAPPY");
		PQ.add("HEALTHY");
		
		System.out.println(PQ);
		System.out.println(PQ.size());
		
		System.out.println(PQ.element()); //Retrieves, but does not remove, the head of this queue. This methoddiffers from peek only in that it throws an exception ifthis queue is empty.
		System.out.println(PQ);
		System.out.println(PQ.poll()); //Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(PQ);
		System.out.println(PQ.peek()); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty
		System.out.println(PQ);
		
	}

}

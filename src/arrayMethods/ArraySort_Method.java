package arrayMethods;

import java.util.Arrays;

public class ArraySort_Method {

	public static void main(String[] args) {
		//program to declare Arrays.sort method
		//Arrays.sort methods are present in "java.util.Arrays"
		//so to import methods of array it need to import before class but when u take Arrays.sort it automatically imported

		//use 2nd type of declaration+initialization of array at a time
		char xy[]= {'A', 'Z', 'L', 'D', 'N', 'F'};
		
		
		//use this at is it 
		System.out.println("****print this char as it******");
		//when we use string class or array class we need to index so index is nothing but
		//max index=length-1
		for(int a=0; a<=xy.length-1; a++ )
		{
			System.out.println(xy[a]);
		}
		
		System.out.println("******print this char from down to up*******");
		//for this use for loop also differently 
		for(int b=xy.length-1; b>=0; b--)
		{
			System.out.println(xy[b]);
		}
		
		System.out.println("*****print this char in ascending order*********");
		//when u need to sort the datatype that time we can use arrays.sort
		Arrays.sort(xy);
		for(int c=0; c<=xy.length-1; c++)
		{
			System.out.println(xy[c]);
		}
		
		System.out.println("******print this char in decending order********");
		for(int d=xy.length-1; d>=0; d--)
		{
			System.out.println(xy[d]);
		}
	}

}

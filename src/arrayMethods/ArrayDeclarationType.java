package arrayMethods;

public class ArrayDeclarationType {

	public static void main(String[] args) {
	//	1st type of declaration of array
		//we take string type of data type 
		System.out.println("This is 1st type of declaration of array");
		String obj1[]= new String[5]; //declaration of array
		obj1[0]="Kirti";  //this below all is initialization of array
		obj1[1]="Ramesh";
		obj1[2]="Mangala";
		obj1[3]="Pawan";
		obj1[4]="Neha";
		
		//print 1st type of declaration
		for(int a=0; a<=obj1.length-1; a++)
		{
		System.out.println(obj1[a]);
		}
		
		
		
System.out.println("This is 2nd type of declaration of array");
 //2nd type of how to declare a array with at a time declaration and initialization
        // String obj2[]= new String[5]; this is use only in 1st type
//at this 2nd type u dont need to creat object 1st use obj creat means declaration and gives value in initialize at the same time
       String  obj2[]= {"Kirti","Ramesh","Mangla","Pawan","Neha"};
       
       for(int b=obj2.length-1; b>=0; b--)
       {
    	  System.out.println(obj2[b]); 
       }

	}

}

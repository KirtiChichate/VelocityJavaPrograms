package string_assignment;

public class SplitMethod {

	public static void main(String[] args) {
		//this is declarartion and initialization of string 
		String xy="My Name Is Kirti";
		String ab="I_live_in_Nagpur";
		String mn="I,am,post,graduate";
		//now give one reference t string class  object
		System.out.println("1st string xy is in process");
		String refxy=" "; //here we need to give that particular object as a reference by any object name like 
		//here my reference object is"ref" and my 1st object of 1st string is "xy"
		//and i give reference as in that string my refernce is "white space "
		
		//just creat another object with this reference object and call split method
		 String[] strg1 =xy.split(refxy);
		  
 //now it needs for loop to execute this string
		 for(int a=0; a<=strg1.length-1; a++)
		 {
		System.out.println(strg1[a]);
		 }

		 
		 
		 
		 //write all this same for other two string
		 System.out.println("2nd string ab is in process");
		 String refab="_";
		 String[] strng2=ab.split(refab);
		 
		 for(int a=0; a<=strng2.length-1; a++)
		 {
			 System.out.println(strng2[a]);
		 }
		 
		 
		 
		 System.out.println("3rd string mn is in process");
		 String refmn=",";
	String[] strng3=mn.split(refmn);
	
	for(int a=strng3.length-1; a>=0; a--)
	{
		System.out.println(strng3[a]);
	}
	}

}

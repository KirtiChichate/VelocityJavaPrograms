package array_Multidimentional;

public class MultiDi_usingMethod2 {

	public static void main(String[] args) {
		
//array declaration and initialization at the same time
		char obj[][]= {{'A','B'},{'C','D'}}; //in this array choose its capacity depends upon the value i initiated
		
		//use this array 
		//now to use we need to creat two for loop 
				//1) for row is outer loop
				//2) for coloumn is inner loop
				
		for(int a=0; a<=obj.length-1; a++)//this is outer loop it check the rows and goes on increasing
		{
			for(int b=0; b<=obj.length-1; b++)
			{
				System.out.print(obj[a][b]+" "); //remove ln if we need to write in one line and
				                                //and use +" " for taking space between two char
			}
			System.out.println();
		}
		
	}

}

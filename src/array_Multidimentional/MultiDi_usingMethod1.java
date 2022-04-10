package array_Multidimentional;

public class MultiDi_usingMethod1 {

	public static void main(String[] args) {
		//1-->array declaration for 2*2 matrix or 2dimentional
		System.out.println("This is multidimentional execution with method 1 type");
		char obj1[][]=new char[2][2];
		//2-->array initialization
		obj1[0][0]='A';
		obj1[0][1]='B';
		obj1[1][0]='C';
		obj1[1][1]='D';
		
		//3-->use this array
		 
	//now to use we need to creat two for loop 
		//1) for row is outer loop
		//2) for coloumn is inner loop
		
		for(int a=0; a<=obj1.length-1; a++)    //this is outer loop it check the rows and goes on increasing
		{  //it will not take same variable name becz this is use for the same loop
			for(int b=0; b<=obj1.length-1; b++) //this is a inner loop for coloumns 
			{
				System.out.print(obj1[a][b]+" ");
			}
			//for take cd on next line to look like a matrix use below frame
			System.out.println();
		}
			
			
			
			
			
			
			
		

	}

}

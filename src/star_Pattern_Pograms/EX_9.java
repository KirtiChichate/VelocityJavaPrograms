package star_Pattern_Pograms;

public class EX_9 {

	public static void main(String[] args) {
		
//		   *
//		  * *
//		 * * *
//		* * * *
//	   * * * * *
//	  * * * * * *
//	   * * * * *
//	    * * * *
//	     * * *
//	      * *
//	       *

		int star=1;
		int space=5;
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}	
			
		
		    int star1=5;
			int space1=1;
			for(int m=1; m<=5; m++)
			{
			for(int k=1; k<=space1; k++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star1; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space1++;
			star1--;
			}
		
	}

}

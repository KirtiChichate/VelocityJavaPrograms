package star_Pattern_Pograms;

public class EX_2 {

	public static void main(String[] args) {
		
//		*****
//		*****
//		*****
//	step 1)---> outer for loop for rows so here rows=3	
		for(int i=1; i<=3; i++ )
		{
//   step 2)---> inner for loop for column so here column=5
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");  //here star will be print in horizontally so remove "ln"
			}
			
			//after this for loop we need to print in next line so take one print statement
			System.out.println();
		}
	}

}

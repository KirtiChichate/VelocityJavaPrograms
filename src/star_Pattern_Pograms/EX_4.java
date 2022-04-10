package star_Pattern_Pograms;

public class EX_4 {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
		// 3 rules of pattern
		
		// 1st rule---> check and think about the rows and then column
		// 2nd rule--->now thing about the variable as column star is changing and if spacing then think about that also
		// 3rd rule--->Then if star is increasing then we have add ++ in that or -- in the same.
				
		//Before for loop we have to declare one variable for intializing "star" and take the value of star as the start value of star as per column
		int star=1;
		
		// So there is no change in outer for loop it is same 
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;   //as after changing the line then star get increased so we need to take star++
		}

	}

}

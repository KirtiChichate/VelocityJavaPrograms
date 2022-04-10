package star_Pattern_Pograms;

public class EX_5 {

	public static void main(String[] args) {
		
//		*****
//		****
//		***
//		**
//		*
		// 3 rules of pattern
		
// 1st rule---> check and think about the rows and then column
// 2nd rule--->now thing about the variable as column star is changing and if spacing then think about that also
// 3rd rule--->Then if star is increasing then we have add ++ in that or -- in the same.
		
//		here also same loop executed but in decrease count so how much star u see in 1st row that much so star value it needs to declare
		int star=5;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}

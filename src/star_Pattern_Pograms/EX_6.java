package star_Pattern_Pograms;

public class EX_6 {

	public static void main(String[] args) {
//		*
//	   ***
//	  *****
//	 *******
		
	//here we need to take two variable i.e one for space and one for star
		int star=1;   //as star start from 1 so we need to take 1
		int space=3;  //here in 1st row its having 3 space so space start from 3
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space; j++)  //at start in the 1st row 1st is space then one star is there so 1st for loop of space and then 2nd for star
			{
				System.out.print(" ");  //space ke andar hame space chahiye to wo hum print karenge
				                       //remove ln
			}
			
			//This second for loop is for to print star
			for(int j=1; j<=star; j++)
			{
					System.out.print("*");  //remove ln
				}
			
			System.out.println(); //afetr this 2 for for loop means after calculating about the space and star for 1st row we have to shift to second row thats y we take one print statment
			//decrease the space
			space--;
			//and increase the star
			star=star+2;   //here star is not increment by ++ its increment is by star+2 becz in 1st row its 1 then its mendatory to print star 2 if we take star++ but we require 3 star in 2nd row means nothing but the star+2
		}
		

	}

}

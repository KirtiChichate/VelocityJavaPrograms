package control_statement;

public class ExtraProgram {

	public static void main(String[] args)
	{
		int a=5;
		if (a>=6)
		{
			System.out.println("my value is positive");
		}

		else
		{
			//instead of using this whole block from line no 16 to 23 i can use else if and execute//
			if(a==5)
			{
			System.out.println("my value is equal to");
			}
			else
			{
				System.out.println("my value is negative");
			}
		}
		
	}

}

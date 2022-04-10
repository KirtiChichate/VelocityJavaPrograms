package assignment_Program;

public class LargestAmongThree {

	public static void main(String[] args) {
		Method5();

	}
	public static void Method5()
	{
		System.out.println("Java Program to Find the Largest Among Three Numbers");
		int a=100, b=500, c=800;
		if(a>b)
		{
			System.out.println("a is a largest no");
			if(b>c) 
			{
				System.out.println("b is largest no");
			
			if(c>a)
			{
				System.out.println("c is largest no");
			}
			else
			{
				System.out.println("a is largest no");
			}
			}
			else
			{
				System.out.println("c is largest no ");
			}
		}
			else
			{
				System.out.println("b is largest no");
			}
		
	}
}

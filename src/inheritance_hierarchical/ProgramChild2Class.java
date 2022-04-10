package inheritance_hierarchical;

public class ProgramChild2Class extends ProgramBaseClass
{
// This is another new method to execute nested if control statement//
	public void method3()
	{
		String application="Amazon";
		String category="women";
		String product="watch";
			
		
		
		
		if(application=="Amazon")
		{ //this bracket is open for 1st if and this if open bracket
			System.out.println("if my application is amazon,then my app is open");
			
		if(category=="women")	
		{ //this bracket is open for 2nd if and this if open bracket
			System.out.println("if my category is women then next page is open");
		
		if(product=="watch")	
		{ //this bracket is open for 3rd if and this if open bracket
			{System.out.println("if my product is watch, then i can buy this product");
			}
			}//this bracket is close for 3rd if and this if open bracket
		
		else
		{
			System.out.println("if my product is not watch,then check the product");
		}
		} //this bracket is close for 2nd if and this 'if' close bracket
		else
		{
			System.out.println("if my category is not women,then check the category and retry");
		}
		}//this bracket is close for 1st if and this if close bracket
		else 
		{
		System.out.println("if my application is not amazon then search for amazon application");	
		}//this bracket is close for 1st if else statement is here and this else close bracket
		
		
		}//this is bracket of method
	
	
	}//this is a bracket of class
	
	
	
	


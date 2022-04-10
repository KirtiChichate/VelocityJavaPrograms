package control_statement;

public class Else_if_condition {

	public static void main(String[] args) {
		//else if condition is used for more then 2condition//
		//my conditions are//
		//if i ans 10 out 10 que then i got selected in company//
	//else not if it is zro ans i am not seelected//
	//else if i ans 5 out of 10 then i am applicable for 2nd round//
		//else if i ans greater then 7 que then i am directly in 2nd round //
		//else if i ans 9 que then i am close to crack interview//
		
		
		
		int Answer=9;
		if (Answer==10)
		{
			System.out.println("I got selected in company");
		}

		else if (Answer==5)
		{
		System.out.println("I am applicable for 2nd round");	
		}
		else if (Answer>7 && Answer<9)
		{
			System.out.println("I am directly in 2nd round");
		}
		else if (Answer==9)
		{
			System.out.println("I am close to crack interview");
		
		}
		else
		{
			System.out.println("I am not selected");
		}
	}

}

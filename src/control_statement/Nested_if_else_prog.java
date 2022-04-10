package control_statement;

public class Nested_if_else_prog {

	public static void main(String[] args)
	{
	//1st enter username if it is correct then enter password then verify password and enter captcha//
		//if captcha is not correct then reenter captcha//
		//if password is not correct then plz check password//
		//if username is not correct then enter correct username//
		
		String username= "kirti";
		String password= "krchichate";
		String captcha= "K@123";
		
		if (username=="kirti")
		{
			System.out.println("your username is correct, please enter password");
		
		  if (password=="krchichate")
		{
			System.out.println("your password is correct,please verify captcha");
		
		     if (captcha=="K@123")
		{
			System.out.println("your captcha is correct, you are ready to sign in");
		}
		
		     else
		{
			System.out.println("your captcha is incorrect, please try once again ");
		}
		}
		  else
		{
			System.out.println("your password is incorrect, please reenter your password");
		}
		
		}
		else
		{
			System.out.println("your username is incorrect, please check your username and enter correct username");
		}
	}
	
}

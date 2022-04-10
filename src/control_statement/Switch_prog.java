package control_statement;

public class Switch_prog {

	public static void main(String[] args) {
	//enter months
		//1--- this is 1st day of  january
		//2----this is 2nd day of february likewise
		
		String months="december";
		
		switch (months) 
		{
		case "january":
			System.out.println("This is 1st january");
	
			break;
		
		case "february":
			System.out.println("This is 12th february");
			break;
		
		case "march":
			System.out.println("This is 5th march");
	
			break;
		
		case "april":
			System.out.println("This is 3rd april");
	
			break;
			
		case "may":
			System.out.println("This is 4th may");
	
			break;	
			
		case "june":
			System.out.println("This is 6th june");
	
			break;
			
		case "july":
			System.out.println("This is 10th july");
	
			break;
			
		case "august":
			System.out.println("This is 12th august");
	
			break;
		case "september":
			System.out.println("This is 15th september");
	
			break;
			
		case "october":
			System.out.println("This is 20th october");
	
			break;
			
		case "november":
			System.out.println("This is 25th november");
	
			break;

		case "december":
			System.out.println("This is 31st december");
	
			break;
		default:
			System.out.println("enter months between january to december");
			break;
		}
		
		
		
		
		
		
		
	}

}

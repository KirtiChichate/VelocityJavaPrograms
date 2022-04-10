package Loop_study;

public class forLoop_adding_number {

	public static void main(String[] args) {
		//herewe are using for loop //
		//for eg for loop is used to print something n no of times//
		//suppose i need to print my name 5 times so syntax for this is//
        //syntax= for(initialization; condition; increment/decrement)
		
		//1-->2-->3-->4-->5  this is increment condition so my syntax will be i=1; i<=5; i++
		//here i am taking from 1 ---->5 means 1<=5 so this is d real condition for this
		//here my initial value is 1 so i am taking i=1
		//now i need to print this 5 times so i am compairing this with 5 and taking increment as i++
		//this are integer so i need to take this always in in
		for(int i=1; i<=5; i++)
		{
		System.out.println("My name is kirti");	
		}
		System.out.println("*******************************************");
		//5-->4-->3-->2-->1  this is decrement condition so my syntax will be i=5; i>=1; i--
		//here i am taking from 5 ---->1 means 5>=1 so this is d real condition for this
		//here my initial value is 5 so i am taking i=5
		//now i need to print this 5 times so i am compairing this with 5 and taking decrement as i--
				
		for (int i=5; i>=1; i--)
		{
			System.out.println("its me");
		}
		
			
		
		
	}

}

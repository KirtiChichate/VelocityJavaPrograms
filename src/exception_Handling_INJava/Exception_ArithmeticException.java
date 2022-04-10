package exception_Handling_INJava;

public class Exception_ArithmeticException {

	public static void main(String[] args) {

		int a=5;
		int b=0;
		
		try {
			
			int div=a/b;
			System.out.println("Value of this division is: "+div);
			
		} 
		catch (ArithmeticException Ath) {
			System.out.println(" Zero cannot be divisible by any no");
			Ath.printStackTrace();
			
		}
		
		
		

	}

}

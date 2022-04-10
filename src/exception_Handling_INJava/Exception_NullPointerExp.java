package exception_Handling_INJava;

public class Exception_NullPointerExp {

	public static void main(String[] args) {
	
		String a=null;
		
		try {
			
			System.out.println(a.charAt(1));
		} 
		
		catch (NullPointerException nullex) 
		{
           System.out.println("String Value can not be null");
           nullex.printStackTrace();

		}
		

	}

}

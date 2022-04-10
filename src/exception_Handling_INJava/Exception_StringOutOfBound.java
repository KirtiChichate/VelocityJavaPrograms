package exception_Handling_INJava;

public class Exception_StringOutOfBound {

	public static void main(String[] args) {
	
		String name="kirti";
		try {
			System.out.println(name.charAt(8));
			
		} 
		
		catch (StringIndexOutOfBoundsException objname)
		{
          System.out.println("Select the exact range of string within 0-4");
          objname.printStackTrace();

		}
		
		

	}

}

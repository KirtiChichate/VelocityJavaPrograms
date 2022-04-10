package inheritance_hierarchical;

public class ProgramMainMethod {

	public static void main(String[] args) 
	{
		//creat object of class ProgramChild1Class
		ProgramChild1Class obj= new ProgramChild1Class();
		obj.method1();
		obj.method2();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// creat object of class ProgramChild2Class
		
		ProgramChild2Class obj1= new ProgramChild2Class();
		obj1.method3();
		 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ProgramChild3Class obj2= new ProgramChild3Class();
		obj2.method4();

	}

}

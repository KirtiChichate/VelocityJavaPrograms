package interface_concept;

//whenever we are using interface at that time we use "implements" keyword to join interface and class
public class AddClassInterface1_Interface2 implements Interface2_  {
  
	
	public static void main(String[] args) {
		//creat object for this incomplete method which is completed in this class
		
		AddClassInterface1_Interface2 obj= new AddClassInterface1_Interface2();
		obj.test();
		obj.test1();
		obj.test3();
		obj.test4();

	}

	@Override
	public void test() {
		System.out.println("This method from interface1 is completed in this implementation class");
		
	}

	@Override
	public void test1() {
		System.out.println("This method from interface1 is completed in this implementation class");
		
	}

	@Override
	public void test3() {
		System.out.println("This method from interface2_ is completed in this implementation class");
		
	}

	@Override
	public void test4() {
		System.out.println("This method from interface2_ is completed in this implementation class");
		
	}

}

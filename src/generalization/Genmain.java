package generalization;

public class Genmain {

	public static void main(String[] args) {
		//to call all the methods from that class only
		//Create of object of only that particular class and call all methods
		System.out.println("#########Gensubclass1###################");
		Gensubclass1 obj1= new Gensubclass1();
		obj1.Addition();
		obj1.Employee_details();
		obj1.Multiplication();
		obj1.Class1();
		System.out.println("#########Gensubclass1###################");
		
		System.out.println("#########Gensubclass2###################");
		Gensubclass2 obj2= new Gensubclass2();
		obj2.Addition();
		obj2.Employee_details();
		obj2.Multiplication();
		obj2.class2();
		System.out.println("#########Gensubclass2###################");
		
		System.out.println("#########Gensubclass3###################");
		Gensubclass3 obj3= new Gensubclass3();
		obj3.Addition();
		obj3.Employee_details();
		obj3.Multiplication();
		obj3.Class3();
		System.out.println("#########Gensubclass3###################");

	}

}

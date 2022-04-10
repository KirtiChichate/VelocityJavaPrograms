package casting;

public class UpcastingMainClass {

	public static void main(String[] args) {
		//call the methods from UpcastingSubclass1 so creat object for this
		UpcastingSubclass1 obj1= new UpcastingSubclass1();
		obj1.Method();
		System.out.println("##############################################");
			//call the methods from UpcastingSubclass2 so creat object for this
		UpcastingSubclass2 obj2= new UpcastingSubclass2();
		obj2.Method();
		obj2.Test();
		System.out.println("#######################################################");
		System.out.println("this is upcasting method calling");
		//write object for upcasting 
		
		
		UpcastingSubclass1 obj3= new UpcastingSubclass2();
		System.out.println("this is method from UpcastingSubclass2");
		
		obj3.Method(); //this is a method of UpcastingSubclass2
		              //but at the time of taking obj3. it showa method of UpcastingSubclass1 in text box may be this happens because of upcasting
		//obj3.test(); this method from same class i.e  UpcastingSubclass2 is not possible 
		              //becz this is a separate method not same method so it cant call
		
 
	}
}



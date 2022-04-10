package casting;

public class UpcastingSubclass2 extends UpcastingSubclass1
{
   //write same method name from class UpcastingSubclass1 but with having different defination
	//becz for applying upcasting it need method overriding concept and for that it need same method name
	 public void Method() //this is the same method from UpcastingSubclass1
	 {
		 double a=5.2354;
		 float b=25.1235f;
		 String fruit="Apple";
		 System.out.println("Addition of A and B is "+(a+b));
		 System.out.println("My fav fruit is "+fruit);
		 
	 }
	 
	 public void Test() //this is the method of this class UpcastingSubclass2
	 {
		 System.out.println("This is my extra method from UpcastingSubclass2");
	 }
}

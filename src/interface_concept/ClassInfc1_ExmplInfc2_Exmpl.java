package interface_concept;
//this is a multiple inheritance
public class ClassInfc1_ExmplInfc2_Exmpl implements Infc1_Exmpl,Infc2_Exmpl {

	public static void main(String[] args)
	{
		//creat object of this implementation class
		ClassInfc1_ExmplInfc2_Exmpl obj= new ClassInfc1_ExmplInfc2_Exmpl();
		obj.addition();
		obj.Area(12, 15);

	}

	@Override
	public void addition() {
		int a=10;
		int b=20;
		System.out.println("Addition of method is "+(a+b));
		
	}

	@Override
	public void Area(int Length, int Breadth) {
		System.out.println("The area of rectangle is "+(Length*Breadth));
	}

}

package constructor_study;
// default type constructor//
public class constructor_manually_declaration {
//write constructor in between the class body but not in main body//
	
		int a=13;   //manually declaration +initialization of values//
		int b=5;
		float c=1.5f;
		char d='a';
		
	
	
	
	public static void main(String[] args)
	{
	//assiging constructor object in main body//	
		
	constructor_manually_declaration obj1= new 	constructor_manually_declaration();
	System.out.println("a defines value "+obj1.a);
	System.out.println("b defines value "+obj1.b);
	System.out.println("c defines value "+obj1.c);
	System.out.println("d defines value "+obj1.d);	
	
	obj1.test1();
	
	}
 
	public void test1()
	{
		System.out.println("test1 program running");
	}
	
	
}

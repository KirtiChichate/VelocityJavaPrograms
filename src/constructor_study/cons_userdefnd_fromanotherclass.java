package constructor_study;

public class cons_userdefnd_fromanotherclass {
//this is to write program from another class//
	int a;
	int b;
	 public cons_userdefnd_fromanotherclass()
	 {
		 //assiging the value means declaration//
		 a=10;
		 b=15;
		 
	 }
	
	public static void main(String[] args)
	{
		//creat an object//
		cons_userdefnd_fromanotherclass obj5= new cons_userdefnd_fromanotherclass();
		
System.out.println("this is the value of same class");
System.out.println(obj5.a);
System.out.println(obj5.b);

System.out.println("this is the value from another class");
//creat object for form another class//
       cons1_userdefnd_fromanotherclass obj6= new cons1_userdefnd_fromanotherclass();
       System.out.println(obj6.a);
       System.out.println(obj6.b);

	}

}

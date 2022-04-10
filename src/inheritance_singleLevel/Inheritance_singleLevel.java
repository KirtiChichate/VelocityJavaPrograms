package inheritance_singleLevel;

public class Inheritance_singleLevel  {

	public static void main(String[] args) {
		
		//creating object from Inheritance_addition class//
		//calling obj for that method//
		Inheritance_addition obj= new Inheritance_addition();
		obj.add();
		Inheritance_addition.add1(); //static method syntax- classname.methodname();
		
		
		
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//creating object from Inheritance_subtraction extends Inheritance_addition//
		//calling obj for that method//
		Inheritance_subtraction obj1= new Inheritance_subtraction();
		obj1.subtrc1();
		obj1.add();
		Inheritance_subtraction.subtrc();
		Inheritance_subtraction.add1();
		
		
		
		
	}

}

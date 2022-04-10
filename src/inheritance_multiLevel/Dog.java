package inheritance_multiLevel;

public class Dog extends Cat
{

	public void bark()
	{
		System.out.println("Dog is barking ");
	}
	
	public static void labrador()
	{
		System.out.println("dog type is labrador");
	}
	
	public static void main (String[]args)
	{
		Dog obj= new Dog(); //creat obj from that method which is last class u created means other class object can run with the help of this last class
		obj.eat();
		obj.sound();
		obj.bark();
		System.out.println("########################################");
	// directly call static methods 
		Dog.labrador();
		Dog.cute();
		Dog.run();
		System.out.println("############################################");
		
		//use global static and nonstatic variable here
		System.out.println("colour of animal is "+obj.colour);
		System.out.println("height of animal is "+obj.colour);
		
	}
	
	
	
	
	
}

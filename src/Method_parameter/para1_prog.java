package Method_parameter;

public class para1_prog {

	public static void main(String[] args)
	{
		//write programme in syso in single line//
		
		System.out.println("i am writing parameter program ");
		System.out.println("===============================");
		//To call prog1//
		//create an object//
		para1_prog mv= new para1_prog();
		//to call method//
		mv.prog1("kgf", 120, 'c', 7.08);
		mv.prog1("ddlj", 240, 'e', 8.1);
		mv.prog1("pandu", 270, 'b', 8.6);		
		
		//to call from another class//
		//create object//
		para2_prog obj= new para2_prog();
		//call this object as s method//
		obj.method4("arnavi", 12, 'c', 20.12);
		obj.method4("rudra", 7, 'a', 25.13);

	}
public void prog1(String name, int price,char review, double rating)
{

	System.out.println("Name of movie********** "+name);	
	System.out.println("price of movie ticket********* "+price);
	System.out.println("movie review********** "+review);
	System.out.println("rating of movie********** "+rating);
	System.out.println("===================================");
}
	
	
	
}

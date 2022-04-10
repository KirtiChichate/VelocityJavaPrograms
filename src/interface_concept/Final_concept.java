package interface_concept;

public class Final_concept
{

	int a=10;
	static int b=20;
	final int c=30;
	
	public static void main(String[] args) 
	{
		Final_concept obj= new Final_concept();
		obj.finalconcept();

	}
	
	public void finalconcept()
	{
		a=a+25; //this is nonstatic variable and i am not taken int before this becz i am declaring global 'a's value and adding in that a=a+25
		        //so here no need to take int before declaring any variable
		System.out.println("Value of nonstatic a is "+a);
		b=b+25; //this is nonstatic variable and i am not taken int before this becz i am declaring global 'b's value and adding in that b=b+25
		 //so here no need to take int before declaring any variable
		System.out.println("Value of nonstatic b is "+b);
		//c=c+25; // but this is not possible becz i initialize c as a final so i cant use anywhere here
		        //we i make any variable final then its shows that it is finalized so cant use same name to other
	}

}

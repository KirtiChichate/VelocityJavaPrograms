package Data_types;

public class Primitive_decimal_datatype {

	public static void main(String[] args) {
		//programme of mix datatypes int , float,double//
		
		int a,b,c,d;
		float e; //here i define e as a float so at the time of initializes i have to take e by adding float//
		
		double f;  //here i define f as a double so if i need exact value i have to initializes f as a double//
		
		a=7;
		b=13;
		c=56;
		d=a*b*c;
		e=(float)b/c;  //this is done bcz i need exact decimal value//
		
		f=(double)(a/b)+d; //double or float is always add in a braket//
		
		System.out.println("value of d is "+d);
		System.out.println("answer of e is "+e);
		System.out.println("result of f is "+f);
		
		

	}

}

package string_assignment;

public class Assignment1 {

	public static void main(String[] args) {
		String A= new String("Komal");
		String B="komal";
		String B1=" is";
		String B2=" Mad";
		String C= new String("Mangla");
		String D="mangla";
		String E= new String("null");
	//	String F=null; //if we assign null like this then it shows exception error by java 
		String G="Kirti @Chichate";
		//Method 1
		int Leg=A.length();
		System.out.println("Value of length method is "+Leg);
		//method2
		String Upp=A.toUpperCase();
		System.out.println("Value of uppercase is "+Upp);
		//Method3
		System.out.println("Value of Lowercase is "+A.toLowerCase());
		//Method4
		boolean Eqa=A.equals(B); //equals define boolean so we it need boolean data type
		System.out.println("Value of Equals is "+Eqa);
		//Method5
		boolean eqa=A==C;
		System.out.println("Value of == is "+eqa);
		//method6
		System.out.println("Value of equals ignorecase is "+A.equalsIgnoreCase(B));
		//Method7
		System.out.println("Value of contains is "+C.contains("mang"));
		//Method8
		System.out.println("Value of is empty "+D.isEmpty());
		System.out.println("Value of null with isempty "+E.isEmpty());
	//	System.out.println("Value of null with isempty "+F.isEmpty()); //it shows error in java
		//Method9
		System.out.println("Value of isblank "+E.isBlank());
		//Method10
		System.out.println("Value of charat "+C.charAt(3));
		//method11
		System.out.println("Value of ends at "+C.endsWith("a"));
		System.out.println("Value of ends at "+C.endsWith("man"));
		//method12
		System.out.println("Value of starts with is "+A.startsWith("mal"));
		System.out.println("Value of starts with is "+A.startsWith("kom"));
		//method13
		System.out.println("Value of startswith prefix and index "+A.startsWith("Kom", 0));
		//method14
		System.out.println("Value of substring is "+G.substring(6));
		//method15
		System.out.println("Value of substring beginsIndex endsWith "+G.substring(0, 7));
		//method16
		System.out.println("Value of concat is "+B.concat(B1).concat(B2));
		//method17
		//indexof check the index of particular charchater enter into like here 'g'
		System.out.println("Value of index of "+D.indexOf('g'));
		//method18
		System.out.println("Value of index of string "+D.indexOf("man"));
		
		
		//method19
		System.out.println("Value of index of startingchar and index "+D.indexOf('a', 4));
		
		//method20
		System.out.println("Value of lastindexof is "+D.lastIndexOf('l'));
		//method21
		System.out.println("value of lastIndexOf string is "+D.lastIndexOf("gla"));
		//method22
		System.out.println("Value of replace character is "+G.replace('@', '#'));
		//Method23
		System.out.println("Value of split is "+G.split(G));

	}

}

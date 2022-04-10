package stringClass_concept;

public class Stringexmp {

	public static void main(String[] args) {
		// without using new keyword
		// String objname="value";---> constant pool area
		// with using new keyword
		// String objname= new String("value")---> non-constant pool area

		//create object by both the methods
		String Name="Kirti";
		String City= new String("Nagpur");
		String A= "Nagpur";
		String B= new String("pune");
		String C= new String("PUNE");
		String d= new String(" ");
		//use this string object from string class in a java predefined string methods
		
		System.out.println(Name.length()); //for calling this predefined length methodit need to take syso print statement
	    System.out.println(City.length());
	    System.out.println(City.toUpperCase());
	    System.out.println(Name.toLowerCase());
	    //System.out.println(City.);
	    System.out.println("output of 25line----- "+A.equals(B));
	    System.out.println("Output of 26 line----- "+B.equalsIgnoreCase(C));
	    System.out.println("Output of 27 line----- "+City.contains("Nag"));
	    System.out.println("Output of 28 line----- "+d.isEmpty());
	    System.out.println("Output of 29 line----- "+d.isBlank());
	    System.out.println(Name.charAt(3));
	    System.out.println("output of endswith---- "+B.endsWith("ne"));
	    System.out.println("ouput of startswith---- "+Name.startsWith("Kir"));
	    String E= new String("Kirti chichate");
	    System.out.println("output of substring---- "+E.substring(5));
	    System.out.println("Output of concat---- "+Name.concat(A).concat(C));
	System.out.println("output of charAt----- "+C.charAt(3));
	System.out.println("output of indexof---- "+A.indexOf('g'));
	}

}

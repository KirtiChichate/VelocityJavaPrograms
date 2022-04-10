package arrayClass_concept;

public class ArrayStringType {

	public static void main(String[] args) {
		
		//write a string data type program on "My name is Kirti"
		//syntax for array is 
		//  "datatype object[]= new datatype[capacity];
		String name[]= new String[4]; //array declaration
		
		name[0]="My"; //array initialization
		name[1]="name";
		name[2]="is";
		name[3]="Kirti";
		
		//array usase
		for(int a=0; a<=name.length-1; a++)
		{
		System.out.print(" "+name[a]);
		}

	}

}

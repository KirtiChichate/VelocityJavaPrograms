package arrayClass_concept;

public class ArrayCharType {

	public static void main(String[] args) {
		
		//write a char data type program 'A b C d E f
		char Alphabet[]= new char[6]; //Array declaration
		Alphabet[0]='A';
		Alphabet[1]='b';
		Alphabet[2]='C';
		Alphabet[3]='d';
		Alphabet[4]='E';
		Alphabet[5]='f';
		
		for(int a=0; a<=Alphabet.length-1; a++)
		{
		System.out.println(Alphabet[a]);
		}

	}

}

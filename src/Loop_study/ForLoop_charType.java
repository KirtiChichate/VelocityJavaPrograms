package Loop_study;

public class ForLoop_charType {

	public static void main(String[] args) {
		
		//if suppose at condition i am defining small z then compiler print both all capital letter of alphabet and small letter also
		//and if suppose i am defining capital Z then compiler print only capital letter
		//this is depend on initialization letter and condition letter also
		
		for(char alphabet='A'; alphabet<='Z'; alphabet+=1)
		{
			System.out.println(alphabet);
		}

	}

}

package array_3Matrix;

public class MatrixWith2_3 {

	public static void main(String[] args) {
		System.out.println("****print using method 1*****");
		char xy[][]= new char[3][3];
		xy[0][0]='A';
		xy[0][1]='B';
		xy[0][2]='C';
		xy[1][0]='D';
		xy[1][1]='E';
		xy[1][2]='F';
		
		for(int a=0; a<=xy.length-1; a++)
		{
			for(int b=0; b<=xy.length-1; b++)
			{
			
				System.out.print(xy[a][b]+" ");
				
			}
			System.out.println();
		}

	}

}

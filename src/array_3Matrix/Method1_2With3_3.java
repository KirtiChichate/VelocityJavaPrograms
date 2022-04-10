package array_3Matrix;

public class Method1_2With3_3 {

	public static void main(String[] args) {
		System.out.println("**Printing by 1st method****");
		//use 3*3 matrix using method 1
		//1. declaration
		int obz[][]= new int[3][3];
		
		//2. declaration
		obz[0][0]=10;
		obz[0][1]=20;
		obz[0][2]=30;
		obz[1][0]=40;
		obz[1][1]=50;
		obz[1][2]=60;
		obz[2][0]=70;
		obz[2][1]=80;
		obz[2][2]=90;
		
		//3.usage
		for(int a=0; a<=obz.length-1; a++)
		{
			for(int b=0; b<=obz.length-1; b++)
			{
				
					System.out.print(obz[a][b]+" ");
					
			}
			System.out.println();
		}
		
	
		
		
		System.out.println("****Printing by 2nd Method******");
		
		int obzx[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int z=0; z<=obzx.length-1; z++)
		{
			for(int x=0; x<=obzx.length-1; x++)
			{
				System.out.print(obzx[z][x]+" ");
			}
			System.out.println();
		}
	}

}

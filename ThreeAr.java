import java.util.Scanner;

class ThreeAr{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int r=3;
		int c=3;
		
		int d[][]=new int[r][c];
		System.out.println("2D ARRAY");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++){
			System.out.println("Enter the number of array[" + i + "][" + j + "]: ");
			d[i][j]=s.nextInt();
			
			
		
		}
		
		}
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++){
			System.out.print(d[i][j]+"\t");
		
		}
		System.out.println("\n");
		
		
	}
}
}

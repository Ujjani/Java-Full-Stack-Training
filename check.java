import java.util.Scanner;

class check{
		
		public static void main(String[] args) throws Exception
		{
		   Scanner sc=new Scanner (System.in);
		   System.out.println("Enter any number between 1-12:");
		   
		   int var=sc.nextInt();
		   if (var==4||var==7||var==8||var==9)
		   {
					System.out.println("Rainy Day");
		   }
		   
		    if(var==10||var==11||var==12||var==1)
		   {
					System.out.println("ITS WINTER");
		   }
			
			if(var==2||var==3||var==4||var==5)
		   {
					System.out.println("SUMMER");
		   }
		
		}

}
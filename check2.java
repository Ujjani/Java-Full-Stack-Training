


 import java.util.Scanner;

class check2{
		
		public static void main(String[] args) throws Exception
		{
		   Scanner sc=new Scanner (System.in);
		   System.out.println("Enter any number between 1-12:");
		   
		   int var=sc.nextInt();
		   switch(var)
		   {
			 case 4:
			 case 7:
			 case 8:
			 case 9:
			   System.out.println("RAINY");
			   break;
			  
			 case 10:
			 case 11:
			 case 12:
			 case 1:
			   System.out.println("WINTER");
			   break;
			   
			   
			 default:
			    System.out.println("SUMMER");
				break;
				
		   }
							
		
		}

}
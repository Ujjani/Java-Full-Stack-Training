import java.util.Scanner;

class alphabet{
		
		public static void main(String[] args) throws Exception
		{
		   Scanner sc=new Scanner (System.in);
		   System.out.println("Enter any character");
		   
		   char ch=sc.next().charAt(0);
		   switch(ch)
		   {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
			   System.out.println("VOWELS");
			   break;
			 
			   
			 default:
			    System.out.println("CONSONANT");
				break;
				
		   }
							
		
		}

}
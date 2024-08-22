import java.util.Scanner;


class clock{
		public static void main(String[] args) throws Exception 
		{
			Scanner s=new Scanner(System.in);
				
			for (int i=0; i<=24; i++)
			{	
				
				//hours
				System.out.println("Enter hours");
				int hours=s.nextInt();
			}
			
			for (int i=0; i<=60; i++){
				
				//minutes 
				System.out.println("Enter Minutes");
			int min=s.nextInt();}
				
				
			for(int i=0; i<=60; i++){	
				//Seconds 
				System.out.println("Enter Seconds:");
				int sec=s.nextInt();
			}
				
				s.close();
			}
		
		
		
		}
	




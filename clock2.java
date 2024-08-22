import java.util.Scanner;

class clock2
{
   public static void main(String[] args) throws Exception
   
   {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter hours, minutes and seconds :");
		
		int h=s.nextInt();
		int m=s.nextInt();
		int sec=s.nextInt();
		System.out.println("CLOCK");
		System.out.println("hh:mm:secsec");
			
			
			for(h=h; h<24; h++)
			{
				for(m=m; m<60; m++)
				{
					for (sec=sec; sec<60; sec++)
					{
					   System.out.print(+h+":"+m+":"+sec+"\r");
					   Thread.sleep(1000);
					   } sec=0;
					}m=0;
				}h=0;
	}
}
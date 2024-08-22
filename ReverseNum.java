import java.util.Scanner;

class ReverseNum{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num=sc.nextInt();
		int rev=0;
	
		
		while(num!=0)
		{
			int remainder =num%10;
			rev = rev*10+ remainder;
			num=num/10;
		
		}
		System.out.println("The reverse of the given number is: " + rev);
		
		
		
		} 


}


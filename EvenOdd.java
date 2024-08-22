import java.util.Scanner;


class EvenOdd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
        int num=s.nextInt();
		
		 // Checking if number is even or odd number
		 if(num%2==0){
			System.out.println("Number is even");
		 }
		else
		{
		  System.out.println("Number is odd");
		}
        
	
	}

}
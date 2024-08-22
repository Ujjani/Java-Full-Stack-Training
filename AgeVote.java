import java.util.Scanner;


class AgeVote{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age of a person");
        int age=s.nextInt();
		
		 // Checking if person is eligible to vote or not
		 if(age>=18){
			System.out.println("You are eligible to vote");
		 }
		else
		{
		  System.out.println("You are not eligible to vote ");
		}
        
	
	}

}
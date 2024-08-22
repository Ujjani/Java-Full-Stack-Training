import java.util.Scanner;

class Table {
    public static void main(String[] args)
    {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to print the tables: ");
        int num=s.nextInt();

		
        //table 
		for (int i=1; i<=num; i++){
			System.out.println("Multiplication Table for " + i + ":");
			for (int j = 1; j <= 10; j++) {
                System.out.println( i+"x"+j+"="+i * j);
            }

        }
			
		}
        }
    




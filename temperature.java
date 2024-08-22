// Filename: Temperature.java
public class Temperature {
public static void main(String[] args) {
double fahrenheit = 62.5;
/* Convert */
try{
	double celsius = f2c(fahrenheit);
	System.out.println(fahrenheit + "F = " + celsius + "C");

	
	}
	catch(ArithmeticException ae){
		
		System.out.println("EXCEPTION CAUGHT");
	}
}
public static double f2c(double fahr) 
		{
			return (fahr - 32) * 5 / 9;
		}
		}
		

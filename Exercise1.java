import java.util.*;

public class Exercise1 {
int counter;
public static void main(String[] args) {
Exercise1 instance = new Exercise1();
instance.go();
}
public void go() {
int sum=0;
int i = 0; 
try{
while (i<100) {
if (i == 0) sum = 100;
sum = sum + i;
i++;
}System.out.println(sum);}
catch(ArithmeticException ae)
{
	System.out.println("Exception caught");
}

}
}
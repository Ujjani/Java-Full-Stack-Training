import java.util.Scanner;

class tryclock {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter hours, minutes and seconds :");
        
        int h = s.nextInt();
        int m = s.nextInt();
        int sec = s.nextInt();
        s.close(); // Close the scanner
        
        System.out.println("CLOCK");
        
        while (true) {
            // Print the current time in the format hh:mm:ss
            System.out.printf("\r%02d:%02d:%02d", h, m, sec);
            
            // Wait for one second
            Thread.sleep(1000);
            
            // Update seconds
            sec++;
            if (sec == 60) {
                sec = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0; // Reset hours after 24
                    }
                }
            }
        }
    }
}

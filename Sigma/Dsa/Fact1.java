
import java.util.Scanner;

public class Fact1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Or get n from user input: int n = sc.nextInt();
        long sum = 0;
        for (int i = 1, a = 9; i <= n; i++, a += 4) {
            long fact = 1;
            for (int j = 1; j <= a; j++) {
                fact *= j;  
            }
            sum += fact;
             System.out.println("factorials: "+a+"=" + fact);
             System.out.println("Sum of factorials: " + sum);
        }
        
    }
}

import java.util.Scanner;
public class RangePrime {
    public static boolean primeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2;  i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;    
    }
    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeCheck(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeRange(n);
        sc.close();
    }
}

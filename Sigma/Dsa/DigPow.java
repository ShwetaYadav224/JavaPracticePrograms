import java.util.*;
public class DigPow {
    public static long digPow(int n, int p) {
        int reversed = 0;
        int original = n;
        // Reverse the number
        while (n > 0) {
          int last_digit=n%10;
            reversed = reversed * 10 +last_digit;
            n /= 10;
        }
        long sum = 0;
        int count = 0;
        // Iterate over the digits of the reversed number
        while (reversed > 0) {
            int digit = reversed % 10;
            sum += Math.pow(digit, p + count);
            count++;
            reversed /= 10;
        }

        if (sum % original == 0) {
            return sum / original;
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        long res = digPow(n, p);

        if (res == 1) {
            System.out.println("This is magical number");
        } else {
            System.out.println("This is not magical number");
        }
    }
}

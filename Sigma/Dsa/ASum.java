import java.util.*;
public class ASum {
    public static long findNb(long m) {
        long sum = 0;
        long i = 1;
        while (sum < m) {
            sum += Math.pow(i, 3);
            if (sum == m) {
                return i;  // Return the number of cubes
            }
            i++;
        }
        return -1;  // If no such number of cubes exists
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = findNb(n);
        if (res != -1) {
            System.out.println("The number of cubes is " + res);
        } else {
            System.out.println("No such number of cubes exists");
        }
    }
}

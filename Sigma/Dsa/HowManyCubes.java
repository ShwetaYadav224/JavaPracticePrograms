import java.util.*;
public class HowManyCubes {
    public static int HowmanyCubesInTheBox(int n) {
        int sum = 0;
        int count = 0;

        while (sum < n) {
            count++;
            sum += Math.pow(count, 3);
            if (sum == n) {
                return count;
            }
        }
        return -1; // Return -1 if it's not possible to express `n` as a sum of consecutive cubes
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = HowmanyCubesInTheBox(n);
        if (res != -1) {
            System.out.println("Cubes are - " + res);
        } else {
            System.out.println("NO");
        }
        sc.close(); // It's good practice to close the Scanner
    }
}

import java.util.Scanner;

public class Fibonanci {
    public static void fibo(int n) {
        int a = 0;
        int b = 1;
        int temp;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;   
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }
}

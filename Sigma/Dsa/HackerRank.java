import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of queries

        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // Starting number
            int b = in.nextInt(); // Multiplier
            int n = in.nextInt(); // Number of terms in the series

        for(int j =0;j<n;j++){
            a=a+b;
            System.out.print(a+" ");
            b=b*2;
        }
        System.out.println("");
        }
        in.close(); // Close the scanner
    
    
        
    }
}

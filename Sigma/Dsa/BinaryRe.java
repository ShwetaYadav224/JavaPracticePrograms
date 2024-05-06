import java.util.Scanner;

public class BinaryRe {
    public static void DecimalToBinary(int n){
         long r=0;
         long p=0;
        while (n>0) {
            
          long l=n%2;
         r=r+(l*(long)Math.pow(10, p));
         n/=2;
         p++;



            
        }
        System.out.println(r);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DecimalToBinary(n);
    }
}

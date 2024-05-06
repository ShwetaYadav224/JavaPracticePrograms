import java.util.Scanner;

public class FEvenOdd {
        public static boolean isEven(int n){
           return n%2==0;
        }
        public static void check(int n){
            for(int i=0;i<=n;i++){
                 if (isEven(i)){
                  System.out.println(i);
            }
            }
                 }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        check(n);
    }
}

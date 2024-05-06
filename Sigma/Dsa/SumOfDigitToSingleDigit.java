import java.util.*;
public class SumOfDigitToSingleDigit {
   public static void Sum(int n){
    while (n>=10) {
        int sum=0;
        while(n>0){
           int lastDigit=n%10;
           sum+=lastDigit;
           n/=10;
        }
        n=sum;
        
    }
    System.out.println(n);
   }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
}

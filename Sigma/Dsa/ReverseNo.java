import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int lastD=n%10;
             rev=(rev*10)+lastD;
            
            n/=10;
        }
        System.out.print(rev);
    }
}
